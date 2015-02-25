package com.tutorial.basics.constructor;

public class Employee {
	
	private String name;
	private int id;
	private String department;
	
	/*public Employee() {
		this.name = "Default";
	}*/
	public Employee(String nameLocal) {
		name = nameLocal;
	}
	
	public Employee(String name, int id) {
		this(name);
		this.id = id;
	}
	public Employee(String name, int id , String department) {
		this(name, id);
		this.department = department;
	}
	
	public Employee(int id , String name , String department) {
//		this(name, id);
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destroyed " + this.name);
	}
}