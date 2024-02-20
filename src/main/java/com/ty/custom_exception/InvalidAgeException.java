package com.ty.custom_exception;

public class InvalidAgeException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String message){
		super(message);
		
	}
}
