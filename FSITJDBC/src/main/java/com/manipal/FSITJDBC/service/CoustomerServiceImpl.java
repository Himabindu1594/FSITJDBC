package com.manipal.FSITJDBC.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.manipal.FSITJDBC.model.Coustomer;

public class CoustomerServiceImpl implements CustmorService {
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost";
	String uname ="root";
	String pass = "root";

	public List<Coustomer> getCoustomer() {
		// TODO Auto-generated method stub
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,uname,pass);
			}catch(ClassNotFoundException e) {
			
		}
		return null;
	}

}
