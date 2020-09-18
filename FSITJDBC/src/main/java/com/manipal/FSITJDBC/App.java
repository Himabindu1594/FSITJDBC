package com.manipal.FSITJDBC;

import java.util.List;

import com.manipal.FSITJDBC.model.Coustomer;
import com.manipal.FSITJDBC.service.CoustomerServiceImpl;
import com.manipal.FSITJDBC.service.CustmorService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustmorService custmorService = new CoustomerServiceImpl();
		List<Coustomer> custmorList=custmorService.getCoustomer();
		
		for(Coustomer coustomer:custmorList)
		{
			System.out.println(coustomer);
			
		}

	}

}
