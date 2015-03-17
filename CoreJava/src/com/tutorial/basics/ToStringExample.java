package com.tutorial.basics;

class Student {
	public String name;
	public String id;
	public String course;
	public Student(String name, String id, String course) {
		this.id = id; this.name = name; this.course = course;
	}
	@Override
	public String toString() {
		return this.id +" " + this.course + " " + this.name;
	}
}
public class ToStringExample {

	public static void main(String[] args) {
		Student stud = new Student("Bhuvana","23","Java");
//		System.out.println(stud.toString());
		
		Student stud2 = new Student("Pallavi","53","Java");
//		System.out.println(stud);
		
		Student stud3 = null;
		if(stud2.name.equals("Apoorva")) {
			stud3 = new Student("Sarita","53","Java");
		}
		
	}
}
