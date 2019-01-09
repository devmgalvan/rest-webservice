package com.edu.rest.webservices.restfulwebservices.hellowworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;

	//We can use RequestMapping and set what type of request it is
	@RequestMapping(method = RequestMethod.GET , path = "/hello-world")
	public String helloWorld() {
		
		return "Hello World";
	}
	
	//We can use GetMapping for set a Get request
	@GetMapping(path = "/hello-world-2")
	public String helloWorld2() {
		
		return "Hello World";
	}

	//We use a Class for get a JSON response
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean("Hello World");
	}
	
	//hello-world/path-variable/edu
	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}

	//hello-world-internationalized
	@GetMapping("/hello-world-internationalized")
	public String helloWorldInternationalized() {
		
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}
}