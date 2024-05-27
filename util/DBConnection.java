package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                
                String url = "jdbc:mysql://localhost:3308/gall";
                String username = "root";
                String password = "Sivakumar1305";

                Class.forName("com.mysql.cj.jdbc.Driver");

                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
       
        }
		return connection; 

    }
    
    public static void CloseConn() throws SQLException
    {
    	if (connection != null && !connection.isClosed()) {
    	connection.close();
    }
}
}