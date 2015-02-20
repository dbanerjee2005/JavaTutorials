package com.tutorial.basics.classes;

public class Collage {
	static Student noStud;
	
	public static void main(String[] args) {
		Student orange = new Student();
//		orange.name = "Orange";
//		orange.rollNo = 22;
		orange.setName("OrangeOne");
		Student orangeOne = orange;

		System.out.println(orange.getName());
		orangeOne.setName("Apple");
		
		System.out.println(orangeOne.getName());
		
		System.out.println(" New Name "+orange.getName());
		
		/*tudent grape = new Student();
		grape.name = "Grape";
		grape.setRollNo(-23);
		grape.rollNo = -34;
		
		Student apple = new Student();
		apple.name = "Apple";
		apple.rollNo = 34;*/
		
//		System.out.println(orange.name +" "+ grape.name +" "+ apple.name);
//		System.out.println(orange.rollNo +" "+ grape.rollNo +" "+ apple.rollNo);
	}

}
