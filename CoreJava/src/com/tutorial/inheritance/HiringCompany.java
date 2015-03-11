package com.tutorial.inheritance;

public class HiringCompany {

	public static void main(String[] args) {
		/*Employee emp = new Employee("Archna",300,"");
		System.out.println(emp.getId());*/
		
		Employee itemp = new ITEmployee("Pushkar",400);
		itemp.tieColor();
		
		/*Employee netEmp = new NetWorkingEmployee("Sudheer",500); 
		netEmp.tieColor();*/
		
		/*ITEmployee itemp = new ITEmployee("Pushkar",400);
		System.out.println(itemp.getId());*/
		
	
	}

}
