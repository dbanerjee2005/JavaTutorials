package com.tutorial.inheritance.employee.it;

import com.tutorial.inheritance.employee.Employee;

public abstract class ITEmployee extends Employee {
	
	private int programSkillEffi;
	private int noOfProgLang;
	
	public ITEmployee(String name , int id) {
		super(name,id,"IT");
	}
	
	public int getProgramSkillEffi() {
		return programSkillEffi;
	}

	public void setProgramSkillEffi(int programSkillEffi) {
		this.programSkillEffi = programSkillEffi;
	}

	public int getNoOfProgLang() {
		return noOfProgLang;
	}

	public void setNoOfProgLang(int noOfProgLang) {
		this.noOfProgLang = noOfProgLang;
	}
	
	@Override
	public void tieColor(){
		System.out.println("Default Tie Color of " + super.getEmpType()
				+ " Employee with name " + getName() + " is Black");
	}

	@Override
	public void meetingAgenda() {
		System.out.println("Minimum Meeting Time is 1 Hr");
	}
	
	public void algorithmSkills() {
		System.out.println("Skill is minimum 6");
	}
	
	public abstract void programmingSkills();
	
	@Override
	public void vehicleInfo() {
		System.out.println("Has vehicle");		
	}
}