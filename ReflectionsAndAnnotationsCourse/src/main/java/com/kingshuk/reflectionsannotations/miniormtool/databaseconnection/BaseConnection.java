package com.kingshuk.reflectionsannotations.miniormtool.databaseconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public interface BaseConnection {
	// list of methods
	Connection getMyConnection() throws Exception;

	void closeConnection(Connection con);

	void closeStatement(Statement statement);

	void closePreparedStatement(PreparedStatement ps);

	void closeCallableStatement();

	void closeResultSet(ResultSet rs);
}
