package com.tutorial.inheritance;

public abstract class Employee {
	private String name;
	private int id;
	private String empType;

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public Employee(String name, int id, String empType) {
		this.name = name;
		this.id = id;
		this.empType = empType;
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
	
	public void tieColor() {
		System.out.println("Default Tie Color of " + empType
				+ " Employee with name " + name + " is Purple");
	}
	
	public abstract void meetingAgenda();
}