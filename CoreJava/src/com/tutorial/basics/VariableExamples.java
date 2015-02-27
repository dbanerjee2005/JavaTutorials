package com.tutorial.basics;
import com.tutorial.basics.constructor.Employee;

public class VariableExamples {
	String instanceVariable = "Var";
	static String classVariable = "";
	public static void main(String[] args) {
		
		Employee one = new Employee("ONE");
		one.setName("Jayram");
		
		Employee two = new Employee("TWO");
		Employee three = new Employee("THREE");
		
		System.out.println(one.getName() + " " + two.getName() + " " + three.getName() );
		
		System.out.println(Employee.count);
	}
}
