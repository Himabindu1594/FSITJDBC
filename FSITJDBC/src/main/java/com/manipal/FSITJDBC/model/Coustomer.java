package com.manipal.FSITJDBC.model;

public class Coustomer {
	
	private int coustomerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public Coustomer()
	{
		
	}
	
	
	public Coustomer(int coustomerId, String firstName, String lastName, String email, String password) {
		super();
		this.coustomerId = coustomerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	public int getCoustomerId() {
		return coustomerId;
	}
	public void setCoustomerId(int coustomerId) {
		this.coustomerId = coustomerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString()
	{
		return "CoustomerId: "+ this.coustomerId + "\nFirstName: "+this.getFirstName();
		
	}

}
