package com.edu.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

	/**
	 * Return personV1 using url
	 * @return PersonV1
	 */
	@GetMapping("v1/person")
	public PersonV1 personV1() {
		
		return new PersonV1("Eduardo Samblas");
	}
	
	/**
	 * Return personV2 using url
	 * @return PersonV2
	 */
	
	@GetMapping("v2/person")
	public PersonV2 personV2() {
		
		return new PersonV2(new Name("Eduardo", "Samblas"));
	}
	
	/**
	 * Return personV1 using parameters
	 * @return PersonV1
	 */
	@GetMapping(value="person/param", params="version=1")
	public PersonV1 paramV1() {
		
		return new PersonV1("Eduardo Samblas");
	}
	
	/**
	 * Return personV2 using parameters
	 * @return PersonV2
	 */
	
	@GetMapping(value="person/param", params="version=2")
	public PersonV2 paramV2() {
		
		return new PersonV2(new Name("Eduardo", "Samblas"));
	}
	
	/**
	 * Return personV1 using headers
	 * @return PersonV1
	 */
	@GetMapping(value="person/header", headers="X-API-VERSION=1")
	public PersonV1 headerV1() {
		
		return new PersonV1("Eduardo Samblas");
	}
	
	/**
	 * Return personV2 using header
	 * @return PersonV2
	 */
	
	@GetMapping(value="person/header", headers="X-API-VERSION=2")
	public PersonV2 headerV2() {
		
		return new PersonV2(new Name("Eduardo", "Samblas"));
	}

	/**
	 * Return personV1 using produces
	 * @return PersonV1
	 */
	@GetMapping(value="person/header", produces="application/vnd.company.app-v1+json")
	public PersonV1 producesV1() {
		
		return new PersonV1("Eduardo Samblas");
	}
	
	/**
	 * Return personV2 using produces
	 * @return PersonV2
	 */
	
	@GetMapping(value="person/header", produces="application/vnd.company.app-v2+json")
	public PersonV2 producesV2() {
		
		return new PersonV2(new Name("Eduardo", "Samblas"));
	}
}
