package com.kingshuk.reflectionsannotations.miniormtool.databaseconnection;

import com.kingshuk.reflectionsannotations.miniormtool.annotations.DatabaseColumn;
import com.kingshuk.reflectionsannotations.miniormtool.annotations.DatabaseEntity;
import com.kingshuk.reflectionsannotations.miniormtool.annotations.PrimaryKey;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;
import java.util.StringJoiner;
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
        String tableName = null;
        PreparedStatement ps = null;
        try (Connection connection = connectionManager.getMyConnection();) {

            sqlQuery.append("INSERT INTO ");

            // first let's get the class object of E
            Class<? extends Object> class1 = theEntity.getClass();

            // Then let's get the table name.
            DatabaseEntity annotation = class1.getAnnotation(DatabaseEntity.class);

            if (Objects.nonNull(annotation)) {
                tableName = annotation.tableName();
            }

            if (Objects.isNull(tableName)) {
                tableName = class1.getSimpleName().toUpperCase();
            }

            sqlQuery.append(tableName).append("(");

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

}
