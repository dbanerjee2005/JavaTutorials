package com.tutorial.inheritance;

import com.tutorial.inheritance.employee.Employee;
import com.tutorial.inheritance.employee.it.DotNetProgrammer;
import com.tutorial.inheritance.employee.it.JavaProgrammer;
import com.tutorial.inheritance.employee.network.NetWorkingEmployee;

public class HiringCompany {

	public static void main(String[] args) {
		/*Employee emp = new Employee("Archna",300,"");
		System.out.println(emp.getId());*/
		
//		ITEmployee itemp = new JavaProgrammer("Pushkar",400);
//		itemp.tieColor();
//		itemp.algorithmSkills();
		
		/*Employee netEmp = new NetWorkingEmployee("Sudheer",500); 
		netEmp.tieColor();*/
		
		/*ITEmployee itemp = new ITEmployee("Pushkar",400);
		System.out.println(itemp.getId());*/
//		ITEmployee program = new JavaProgrammer("Kavitha",89);
//		program.jvmConcepts();
		
		/*Employee emp = getEmployee("Debashis",45,".net");
		emp.meetingAgenda();
		
		if(emp instanceof JavaProgrammer) {
			JavaProgrammer javaProg = (JavaProgrammer)emp;
			javaProg.jvmConcepts();	
		}else if(emp instanceof DotNetProgrammer) {
			DotNetProgrammer javaProg = (DotNetProgrammer)emp;
			javaProg.microsoftProgramming();	
		}*/
		
		NetWorkingEmployee networkEmp = new NetWorkingEmployee("Ishtiaq",56);
		networkEmp.meetingAgenda();
		
		
		
	}
	
	public static Employee getEmployee(String name , int id, String type){
		if("java".equals(type))
			return new JavaProgrammer(name, id);
		else if(".net".equals(type)) {
			return new DotNetProgrammer(name, id);
		}
		return null;
	}
}