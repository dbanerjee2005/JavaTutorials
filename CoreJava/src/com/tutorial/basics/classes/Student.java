package com.tutorial.basics.classes;

public class Student {
	public String name;
	private int rollNo;
	
	public void setName(String name) {
//	System.out.println("Setting name");
		this.name = name;
	}

	public String getName() {
//		System.out.println("Getting name");
		return this.name;
	}

	public void setRollNo(int localRollNo) {
		if(localRollNo < 0) {
			rollNo = 0;
		}else{
			rollNo = localRollNo;
		}
	}

	public int getRollNo() {
		return this.rollNo;
	}
}