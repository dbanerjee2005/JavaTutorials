package com.tutorial.operators;

public class RelationalOperator {

	public static void main(String[] args) {
		int scienceMark = 50;
		int socialMark = 45;
		System.out.println(scienceMark == socialMark);
		
		/*if(scienceMark != socialMark) {
			System.out.println("Both are Diff.");
		}else {
			System.out.println("Both are equal");
		}*/
		boolean isGreater = scienceMark >= socialMark;
		
		if(isGreater) {
			System.out.println("Greater.");
		}else {
			System.out.println("Less");
		}
		
		System.out.println(isGreater);
	}

}
