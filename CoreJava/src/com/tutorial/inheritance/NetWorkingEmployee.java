package com.tutorial.inheritance;

public class NetWorkingEmployee extends Employee {
	private int debbugingSkill;
	private int serverSkills;
	
	public int getDebbugingSkill() {
		return debbugingSkill;
	}

	public void setDebbugingSkill(int debbugingSkill) {
		this.debbugingSkill = debbugingSkill;
	}

	public int getServerSkills() {
		return serverSkills;
	}

	public void setServerSkills(int serverSkills) {
		this.serverSkills = serverSkills;
	}

	public NetWorkingEmployee(String name, int id) {
		super(name,id,"NETWORK");
	}
	
	/*@Override
	public void tieColor() {
		System.out.println("Default Tie Color of " + getEmpType()
				+ " Employee with name " + getName() + " is Green");
	}*/
	@Override
	public void meetingAgenda() {
		System.out.println("Minimum Meeting Time is 1/2 Hr");
	}
}