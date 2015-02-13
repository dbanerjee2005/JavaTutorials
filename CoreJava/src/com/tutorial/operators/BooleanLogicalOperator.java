package com.tutorial.operators;

public class BooleanLogicalOperator {

	public static void main(String[] args) {
		int scienceMark = 50;
		int socialMark = 60;

		int mathMark = 80;

		/**
		 * Shortcircuit && : when left hand side evaluates to false , it will
		 * not evaluate the right hand side.
		 * 
		 */
		if ((scienceMark > socialMark) && (mathMark++ > 75)
				&& (mathMark == scienceMark)) {
			System.out.println("Good Student");
		} else {
			System.out.println("OK");
		}

		System.out.println(mathMark);
		if ((scienceMark > socialMark) || (mathMark != 75)) {
			System.out.println(" I m good...");
		} else {
			System.out.println(" I m bad...");
		}

		String myValue = "";
		if ((scienceMark > socialMark)) {
			myValue = "TUE";
		} else {
			myValue = "FRI";
		}
		String finalResult = (scienceMark > socialMark) ? "True" : "False";
		System.out.println(finalResult);
	}

}
