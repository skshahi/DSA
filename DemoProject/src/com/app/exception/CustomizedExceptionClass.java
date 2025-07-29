package com.app.exception;

@SuppressWarnings("serial")
public class CustomizedExceptionClass extends RuntimeException {
	
	public CustomizedExceptionClass(String message)
	{
		super(message);
	}

}
