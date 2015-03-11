package com.tutorial.inheritance;

public class ITEmployee extends Employee {
	
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
}