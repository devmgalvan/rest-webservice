package com.edu.rest.webservices.restfulwebservices.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {

	private Integer id;
	
	@Size(min=2, message="Name should have atleast 2 characters")
	private String name;
	
	@Past
	private Date birthDate;
	
	//Constructor
	public User(Integer _id, String _name, Date _birthDate) {
		
		super();
		
		id = _id;
		
		name = _name;
		
		birthDate = _birthDate;
	}
	
	//Default constructor
	protected User() {
		
	}

	//Get id 
	public Integer getId() {
		
		return id;
	}

	//Set id
	public void setId(Integer _id) {
		
		id = _id;
	}

	//Get name
	public String getName() {
		
		return name;
	}

	//Set name
	public void setName(String _name) {
		
		name = _name;
	}

	//Get birth day
	public Date getBirthDate() {
		
		return birthDate;
	}

	//Set birth day
	public void setBirthDate(Date _birthDate) {
		
		birthDate = _birthDate;
	}
	

	//to string
	@Override
	public String toString() {
		
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
}
