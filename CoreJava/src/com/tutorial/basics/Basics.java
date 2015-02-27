package com.tutorial.basics;

import com.tutorial.basics.constants.Constants;
import com.tutorial.basics.constructor.Employee;

class Pencil{
	
}
public class Basics {
	int age2;
	
	public static void main(String[] args) {
		String name = "";
		Employee emp1 = new Employee("Kareena");
		ObjectReferenceExample obj = new ObjectReferenceExample();
		obj.printEmployeeInfo(emp1);
		
		ObjectReferenceExample.printEmployeeInfo(emp1);
		System.out.println(Constants.PROJECT_NAME + " "+ emp1);
		System.out.println(Constants.PROJECT_NAME + " "+ emp1);
	}
}