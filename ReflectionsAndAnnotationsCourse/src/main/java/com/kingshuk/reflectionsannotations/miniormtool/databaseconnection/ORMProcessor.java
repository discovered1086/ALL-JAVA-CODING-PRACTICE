package com.kingshuk.reflectionsannotations.miniormtool.databaseconnection;

import com.kingshuk.reflectionsannotations.miniormtool.annotations.DatabaseColumn;
import com.kingshuk.reflectionsannotations.miniormtool.annotations.DatabaseEntity;
import com.kingshuk.reflectionsannotations.miniormtool.annotations.PrimaryKey;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ORMProcessor<E> {

    private ConnectionManager connectionManager;

    private ORMProcessor() {
        //throw new UnsupportedOperationException("This is not allowed");
    }

    public static <E> ORMProcessor<E> getInstance(ConnectionManager connectionManager) {
        ORMProcessor<E> newEntity = new ORMProcessor<>();
        newEntity.connectionManager = connectionManager;
        return newEntity;
    }

    public void saveEntity(E theEntity) {
        StringBuilder sqlQuery = new StringBuilder(255);
        PreparedStatement ps = null;
        try (Connection connection = connectionManager.getMyConnection();) {

            sqlQuery.append("INSERT INTO ");

            // first let's get the class object of E
            Class<? extends Object> class1 = theEntity.getClass();

            // Then let's get the table name.
            sqlQuery.append(getTableName(class1)).append("(");

            // get all the fields
            Field[] declaredFields = class1.getDeclaredFields();

            StringJoiner joiner = new StringJoiner(",");

            for (Field field : declaredFields) {
                if (field.isAnnotationPresent(PrimaryKey.class)) {
                    PrimaryKey primaryKey = field.getAnnotation(PrimaryKey.class);
                    //sqlQuery.append(primaryKey.columnName());
                    joiner.add(primaryKey.columnName());
                } else if (field.isAnnotationPresent(DatabaseColumn.class)) {
                    DatabaseColumn databaseColumn = field.getAnnotation(DatabaseColumn.class);
                    //sqlQuery.append(databaseColumn.columnName());
                    joiner.add(databaseColumn.columnName());
                }
            }

            sqlQuery.append(joiner.toString())
                    .append(")")
                    .append(" VALUES (");


            final String questionMarks = IntStream.range(0, declaredFields.length)
                    .mapToObj(e -> "?")
                    .collect(Collectors.joining(","));

            sqlQuery.append(questionMarks).append(")");

            System.out.println("The query is:" + sqlQuery);

            ps = connection.prepareStatement(sqlQuery.toString());

            int index = 1;

            for (Field field : declaredFields) {
                if (field.isAnnotationPresent(PrimaryKey.class) || field.isAnnotationPresent(DatabaseColumn.class)) {
                    field.setAccessible(true);
                    String simpleName = field.getType().getSimpleName();
                    String methodName = "set" + simpleName.substring(0, 1).toUpperCase() + simpleName.substring(1);
                    Method method = PreparedStatement.class.getMethod(methodName, int.class, field.getType());
                    method.invoke(ps, index, field.get(theEntity));
                }
                index++;
            }

            ps.executeUpdate();

            //
        } catch (ClassNotFoundException | SQLException | IllegalArgumentException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        } finally {
            connectionManager.closePreparedStatement(ps);
        }
    }

    public Optional<E> readData(Class<E> clazz, Object primaryKeyValue) {
        Statement statement = null;
        Optional<E> newInstance = Optional.empty();
        try (Connection connection = connectionManager.getMyConnection();) {
            statement = connection.createStatement();
            StringBuilder sqlQuery = new StringBuilder(255);
            //Get the table name;
            String tableName = getTableName(clazz);

            sqlQuery.append("SELECT * FROM ").append(tableName).append(" WHERE ");

            // get all the fields
            Field[] declaredFields = clazz.getDeclaredFields();

            AtomicReference<String> primaryKeyColumn = new AtomicReference<>("");

            Arrays.stream(declaredFields)
                    .filter(field -> field.isAnnotationPresent(PrimaryKey.class))
                    .map(field -> field.getAnnotation(PrimaryKey.class))
                    .findFirst().ifPresent(primaryKey1 -> primaryKeyColumn.set(primaryKey1.columnName()));

            sqlQuery.append(primaryKeyColumn.get()).append("= '").append(primaryKeyValue).append("'");

            System.out.println("The query is: " + sqlQuery.toString());

            ResultSet resultSet = statement.executeQuery(sqlQuery.toString());

            while (resultSet.next()) {
                E object = clazz.getConstructor().newInstance();

                Arrays.stream(declaredFields)
                        .forEach(field -> {
                            try {
                                String columnName = null;
                                if (field.isAnnotationPresent(PrimaryKey.class)) {
                                    PrimaryKey primaryKey = field.getAnnotation(PrimaryKey.class);
                                    columnName = primaryKey.columnName();
                                } else if (field.isAnnotationPresent(DatabaseColumn.class)) {
                                    DatabaseColumn databaseColumn = field.getAnnotation(DatabaseColumn.class);
                                    columnName = databaseColumn.columnName();
                                }

                                Object columnValue = getColumnValue(field.getType(), resultSet, columnName);

                                Method method = object.getClass().getMethod("set" + field.getName().substring(0, 1).toUpperCase()
                                        + field.getName().substring(1), field.getType());

                                method.invoke(object, columnValue);

                            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        });

                newInstance = Optional.of(object);
            }

        } catch (ClassNotFoundException | SQLException
                | IllegalArgumentException | NoSuchMethodException
                | IllegalAccessException | InstantiationException
                | InvocationTargetException e) {
            e.printStackTrace();
        } finally {
            connectionManager.closeStatement(statement);
        }

        return newInstance;
    }

    private Object getColumnValue(Class<?> columnType, ResultSet resultSet, String columnName) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        String methodName = "get" + columnType.getSimpleName().substring(0, 1).toUpperCase()
                + columnType.getSimpleName().substring(1);
        Method method = ResultSet.class.getMethod(methodName, String.class);
        return method.invoke(resultSet, columnName);
    }

    private String getTableName(Class<?> class1) {
        DatabaseEntity annotation = class1.getAnnotation(DatabaseEntity.class);
        String tableName = null;
        if (Objects.nonNull(annotation)) {
            tableName = annotation.tableName();
        }

        if (Objects.isNull(tableName)) {
            tableName = class1.getSimpleName().toUpperCase();
        }
        return tableName;
    }

}
