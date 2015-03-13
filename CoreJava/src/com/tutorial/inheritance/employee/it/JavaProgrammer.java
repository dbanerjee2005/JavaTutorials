package com.tutorial.inheritance.employee.it;

public class JavaProgrammer extends ITEmployee {

	public JavaProgrammer(String name, int id) {
		super(name, id);
	}
	
	public void jvmConcepts() {
		System.out.println("I am from a jmv world...");
	}

	@Override
	public void programmingSkills() {
		System.out.println("I am a dot net programmer with GREATE programming skills");
	}
}