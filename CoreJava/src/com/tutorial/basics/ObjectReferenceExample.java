package com.tutorial.basics;

import com.tutorial.basics.constructor.Employee;

public class ObjectReferenceExample {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Kareena");
		Employee emp2 = new Employee("Kareena");
		System.out.println(" emp1.equals(emp2)   "+emp1.equals(emp2));
		emp1 = null;
		System.gc();
		
		String name1 = new String("Jay");
		String name2 = new String("Jay");
		String hello = "Jay";
		
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		
		//emp1.getName().equals(emp2.getName());
		
//		printEmployeeInfo(emp1);
//		System.out.println(emp1.getName());
//		String name = new String("Jayram");
//		printName(name);
//		System.out.println(name);
	}
	
	public static void printEmployeeInfo(Employee emp) {
		System.out.println("Emp Infoo = " + emp.getName() + "  " + emp.getDepartment());
		emp.setName("Default");
	}
	
	public static void printName(String name) {
//		System.out.println("name = "  + name);
		name = "Rout";
	}
	
	public static void printRollNumber(int rollNo){
		
	}
	public void nonStaticMethod(){
		printEmployeeInfo(null);
	}
	
	public void nonStaticMethodOne(){
		
	}
}
