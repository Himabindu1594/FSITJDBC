package com.manipal.FSITJDBC;

import java.sql.SQLException;
import java.util.List;

import com.manipal.FSITJDBC.model.Coustomer;
import com.manipal.FSITJDBC.service.CoustomerServiceImpl;
import com.manipal.FSITJDBC.service.CustmorService;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		CustmorService custmorService = new CoustomerServiceImpl();
		List<Coustomer> custmorList=custmorService.getCoustomer();
		
		for(Coustomer coustomer:custmorList)
		{
			System.out.println(coustomer);
			
		}

	
	 Coustomer c = new Coustomer(105,"hithu","hima","hithu@gmail.com","1234");
	 int b= custmorService.createCustomer(c);
	 
	 if(b>0)
	 {
		 System.out.println("Coustomer Inserted");
	 }
	 else
	 {
		 System.out.println("Coustomer not inserted");
	 }
	 
	}

}
