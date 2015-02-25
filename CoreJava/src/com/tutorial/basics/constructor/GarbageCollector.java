package com.tutorial.basics.constructor;

public class GarbageCollector {

	public static void main(String[] args) {
		Employee emp = null;
		for(int i= 0 ; i  < 50000 ; i++) {
			emp = new Employee("Emp"+i);
		}
	}
}
