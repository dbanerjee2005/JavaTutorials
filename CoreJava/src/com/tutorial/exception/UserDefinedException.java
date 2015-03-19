package com.tutorial.exception;

public class UserDefinedException extends Exception {
	String message;
	
	public UserDefinedException(String message) {
		super(message);
		this.message = message;
	}
	@Override
	public String toString() {
		return "Exception is :" + message;
	}
}