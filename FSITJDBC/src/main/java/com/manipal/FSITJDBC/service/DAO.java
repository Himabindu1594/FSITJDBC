package com.manipal.FSITJDBC.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	
		private DAO()
		{
			
		}
		
		static String driver = "com.mysql.jdbc.Driver";
		private static String url = "jdbc:mysql://localhost/products";
		private static String uname ="root";
		private static String pass = "root";
		
		private static Connection connection;
		
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if(connection==null)
		{
		Class.forName(driver);
		connection = DriverManager.getConnection(url,uname,pass);
		System.out.println("connection object is created ");
		}
		return connection;
	}
}