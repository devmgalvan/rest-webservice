package com.edu.rest.webservices.restfulwebservices.versioning;

public class PersonV2 {

	public Name name;
	
	/**
	 * No arguments constructor
	 */
	
	public PersonV2() {
		
		super();
	}

	/**
	 * Constructor
	 * @param name Person name
	 */
	
	public PersonV2(Name name) {
		
		super();
		
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public Name getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(Name name) {
		this.name = name;
	}
	
	
}
