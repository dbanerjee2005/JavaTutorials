package com.tutorial.exception;

public class HomeWorkException extends Exception {
	String message;
	
	public HomeWorkException(String message) {
		super(message);
		this.message = message;
	}
	@Override
	public String toString() {
		return "Exception is :" + message;
	}
}