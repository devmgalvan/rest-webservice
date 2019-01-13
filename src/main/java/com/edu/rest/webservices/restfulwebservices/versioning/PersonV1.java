package com.edu.rest.webservices.restfulwebservices.versioning;

public class PersonV1 {

	public String name;
	
	/**
	 * No arguments constructor
	 */
	
	public PersonV1() {

		super();
	}

	/**
	 * Constructor
	 * @param name Person name
	 */
	
	public PersonV1(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
