package com.manipal.FSITJDBC.service;

import java.sql.SQLException;
import java.util.List;

import com.manipal.FSITJDBC.model.Coustomer;

public interface CustmorService {
	public List<Coustomer> getCoustomer();
	public int createCustomer(Coustomer coustomer) throws ClassNotFoundException, SQLException;

}
