package com.tutorial.inheritance.employee.it;

public class DotNetProgrammer extends ITEmployee {

	public DotNetProgrammer(String name, int id) {
		super(name, id);
	}

	@Override
	public void programmingSkills() {
		System.out.println("I am a dot net programmer with OK programming skills");
	}
	
	public void microsoftProgramming() {
		System.out.println("Microsoft..");
	}
}
