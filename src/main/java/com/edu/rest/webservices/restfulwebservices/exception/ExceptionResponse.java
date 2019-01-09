package com.edu.rest.webservices.restfulwebservices.exception;

import java.util.Date;

public class ExceptionResponse {

	private Date timestamp;
	
	private String message;
	
	private String detail;

	//Constructor
	public ExceptionResponse(Date _timestamp, String _message, String _detail) {
		
		super();
		
		timestamp = _timestamp;
		
		message = _message;
		
		detail = _detail;
	}

	//Get time stamp
	public Date getTimestamp() {
		
		return timestamp;
	}

	//Set time stamp
	public void setTimestamp(Date _timestamp) {
		
		timestamp = _timestamp;
	}

	//Get message
	public String getMessage() {
		
		return message;
	}
	
	//Set message
	public void setMessage(String _message) {
		
		message = _message;
	}

	//Get detail
	public String getDetail() {
		
		return detail;
	}

	//Set detail
	public void setDetail(String _detail) {
		
		detail = _detail;
	}	
}
