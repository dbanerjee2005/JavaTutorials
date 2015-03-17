package com.tutorial.inheritance.employee.network;

import com.tutorial.inheritance.Jumpable;
import com.tutorial.inheritance.employee.Employee;

public class NetWorkingEmployee extends Employee implements Jumpable {
	private int debbugingSkill;
	private int serverSkills;
	
	void callMe(){}
	
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

	@Override
	public void vehicleInfo() {
		System.out.println("NetWorkingEmployee.vehicleInfo() Do not have a vehicle");
		
	}

	@Override
	public void jump() {
		System.out.println("I jump very high");
	}
}