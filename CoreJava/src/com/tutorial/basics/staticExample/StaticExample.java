package com.tutorial.basics.staticExample;

public class StaticExample {
	private String name;
	
	public static void main(String[] args) {
		StaticExample se = new StaticExample();
		System.out.println(se.name);
	}
	
	public void callMe() {
		System.out.println(this.name);
	}
}