package com.tutorial.exception;

public class FinallyExample {

	public static void main(String[] args) {
		int secondArgument = 2;
		int value = 20;
		int defaultDivideValue = 2;
		String names[] = {"ONE","TWO"};
		
		int finalValue = 0;
		String name = "";
		try {
			finalValue = value/secondArgument;
			name = names[finalValue];
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			aiobe.printStackTrace();
			name = names[0];
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			names = null;
			System.out.println("This is a Finally Block....");
		}
		// 500 lines of code;
		System.out.println(name);
		System.out.println(finalValue);
	}
}