package com.tutorial.basics.constructor;

public class Company {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Kareena");
		Employee emp2 = new Employee("Archana", 101);
		Employee emp3 = new Employee(102 , "Alagu","Testing");
		
		System.out.println(emp1.getName());
		System.out.println(emp2.getName());
		
		Employee emp4 = new Employee("Jinal", 104 , "Testing");
		System.out.println(emp3.getName());
		System.out.println(emp1.getName());
	}
	
	public void getEmployeeInfo(String name){
		System.out.println("Employee name is " + name);
	}
	
	public void getEmployeeInfo(String name , int id){
		System.out.println("Employee name is " + name + " Id = " + id);
		
	}
	
}