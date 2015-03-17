package com.tutorial.inheritance;

import com.tutorial.inheritance.employee.network.NetWorkingEmployee;

public class JumpingJobs {

	public static void main(String[] args) {
		Jumpable rob = new Robots();
		rob.jump();
		
		Jumpable networkEmp = new NetWorkingEmployee("Ishtiaq",56);
		networkEmp.jump();
		
		Jumpable jump = () -> {System.out.println("Hello");};
	}
}