package com.tutorial.exception;

public class CaughtUnCaughtException {

	public static void main(String[] args) {
		doDivision(3,0);

		try {
			doMyHomeWork(null);
			playFootball(2);
		} catch (HomeWorkException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("I want to execute this as well...");
	}
	
	public static void doDivision(int a , int b) throws ArithmeticException {
		if (b == 0) 
			throw new ArithmeticException();
	}
	
	public static void doMyHomeWork(String name) throws HomeWorkException {
		if(name == null)
			throw new HomeWorkException("Homework name should not be null");
		System.out.println(name.toString());
	}
	
	public static void playFootball(int legs) throws Exception {
		if(legs < 2) {
			throw new Exception("Legs should be atleast 2");
		}
	}
}