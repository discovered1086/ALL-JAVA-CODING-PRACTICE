package com.kingshuk.reflectionsannotations.miniormtool.databaseconnection;

import java.io.Serializable;
import java.sql.*;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConnectionManager implements BaseConnection, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -367117343703416863L;
	private String connectionDriver="oracle.jdbc.driver.OracleDriver";
    private String url="jdbc:oracle:thin:@kingsdatabase.csum1qcusypo.us-east-2.rds.amazonaws.com:1521:kingsdb1";
    private String username="hibernate_practice";
    private String entryKey ="Iofdtiger#16";

    public ConnectionManager() {

    }

    public ConnectionManager(String connectionDriver, String url, String dbname, String username, String password) {
        this.connectionDriver = connectionDriver;
        this.url = url;
        this.username = username;
        this.entryKey = password;
    }

    public Connection getMyConnection() throws ClassNotFoundException, SQLException {
        Connection mmcon = null;
        try {
            Class.forName(connectionDriver);
            mmcon = DriverManager.getConnection(url, username, entryKey);
            System.out.println( "connection created");
        } catch (ClassNotFoundException ex) {
            throw new ClassNotFoundException("the driver manager class cannot be found");
        } catch (SQLException sqe) {
            throw new SQLException("error while acquiring the connection");
        }

        return mmcon;                                         //return the connection object.

    }


    public void closeResultSet(ResultSet rs) {
        try {
            if (!rs.isClosed()) {
                rs.close();
            }
        } catch (SQLException sql) {
            throw new RuntimeException("Result set could not be closed");
        }
    }

    public void closeConnection(Connection con) {
        try {
            if (!con.isClosed()) {
                con.close();

            }
        } catch (SQLException ex) {
            throw new RuntimeException("error occurred while closing the connection");
        }
    }

    public void closeStatement(Statement statement) {
        try {
            if (Objects.nonNull(statement) && !statement.isClosed()) {
                statement.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("error occurred while closing the connection");
        }
    }

    public void closePreparedStatement(PreparedStatement ps) {
        try {
            if (Objects.nonNull(ps) && !ps.isClosed()) {
                ps.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("error occurred while closing the connection");
        }
    }

    public void closeCallableStatement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
