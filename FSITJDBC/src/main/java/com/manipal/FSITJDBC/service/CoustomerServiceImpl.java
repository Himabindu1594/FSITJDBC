package com.manipal.FSITJDBC.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.FSITJDBC.model.Coustomer;

public class CoustomerServiceImpl implements CustmorService {
	List<Coustomer> coustomerList;
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost/products";
	String uname ="root";
	String pass = "root";

	public List<Coustomer> getCoustomer() {
		// TODO Auto-generated method stub
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,uname,pass);
			Statement stmt = conn.createStatement();
			String query = "select * from coustomer";
			ResultSet rs = stmt.executeQuery(query);
			
			coustomerList = new ArrayList<Coustomer>();
			
			while(rs.next())
			{
				Coustomer coustomer = new Coustomer();
				coustomer.setCoustomerId(rs.getInt(1));
				coustomer.setFirstName(rs.getString(2));
				coustomer.setLastName(rs.getString(3));
				coustomer.setEmail(rs.getString(4));
				coustomer.setPassword(rs.getString(5));
				coustomerList.add(coustomer);
				
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return coustomerList;
	}

}
