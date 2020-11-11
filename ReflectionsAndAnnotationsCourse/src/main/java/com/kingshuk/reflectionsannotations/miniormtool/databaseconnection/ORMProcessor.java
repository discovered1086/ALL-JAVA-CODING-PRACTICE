package com.kingshuk.reflectionsannotations.miniormtool.databaseconnection;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

import com.kingshuk.reflectionsannotations.miniormtool.annotations.DatabaseColumn;
import com.kingshuk.reflectionsannotations.miniormtool.annotations.DatabaseEntity;
import com.kingshuk.reflectionsannotations.miniormtool.annotations.PrimaryKey;

public class ORMProcessor<E> {

	private ConnectionManager connectionManager;

	public void setConnectionManager(ConnectionManager connectionManager) {
		this.connectionManager = connectionManager;
	}

	public void saveEntity(E theEntity) {
		// Connection connection = null;
		// PreparedStatement ps = null;
		StringBuilder sqlQuery = new StringBuilder(255);
		String tableName = null;
		try (Connection connection = connectionManager.getMyConnection();
				PreparedStatement ps = connection.prepareStatement(sqlQuery.toString());) {

			sqlQuery.append("INSERT INTO ");

			// first let's get the class object of E
			Class<? extends Object> class1 = theEntity.getClass();

			// Then let's get the table name.
			DatabaseEntity annotation = class1.getAnnotation(DatabaseEntity.class);

			if (Objects.nonNull(annotation)) {
				tableName = annotation.tableName();

				if (Objects.nonNull(tableName)) {
					tableName = class1.getSimpleName().toUpperCase();
				}
			}

			sqlQuery.append(tableName).append("(");

			// get all the fields
			Field[] declaredFields = class1.getDeclaredFields();

			for (int i = 0; i < declaredFields.length; i++) {
				Field field = declaredFields[i];
				if (field.isAnnotationPresent(PrimaryKey.class)) {
					PrimaryKey primaryKey = field.getAnnotation(PrimaryKey.class);

					sqlQuery.append(primaryKey.columnName());
				} else if (field.isAnnotationPresent(DatabaseColumn.class)) {
					DatabaseColumn databaseColumn = field.getAnnotation(DatabaseColumn.class);

					sqlQuery.append(databaseColumn.columnName());
				}

				if (i != declaredFields.length - 1) {
					sqlQuery.append(",");
				}
			}

			sqlQuery.append(")").append(" VALUES (");

			for (int i = 0; i < declaredFields.length; i++) {
				sqlQuery.append("?");

				if (i != declaredFields.length - 1) {
					sqlQuery.append(",");
				}
			}

			sqlQuery.append(")");

			int index = 1;

			for (Field field : declaredFields) {
				if (field.isAnnotationPresent(PrimaryKey.class) || field.isAnnotationPresent(DatabaseColumn.class)) {
					if (field.getType().equals(String.class)) {
						ps.setString(index, String.valueOf(field.get(theEntity)));
					} else if (field.getType().equals(int.class)) {
						ps.setInt(index, (Integer) field.get(theEntity));
					}
				}
			}
			
			ps.execute();

			//
		} catch (ClassNotFoundException | SQLException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
