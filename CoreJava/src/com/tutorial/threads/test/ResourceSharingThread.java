package com.tutorial.threads.test;

public class ResourceSharingThread {
	public static void main(String[] args) {
		System.out.println("Hello Guys.. I am sleeping..");
		
		System.out.println(Thread.currentThread().getName());
		
		Runnable horse = new Horse();

		Thread sudheer = new Thread(horse, "Sudheer");
		Thread kavitha = new Thread(horse, "Kavitha");
		
		sudheer.start(); 
		kavitha.start();
		
		System.out.println("==================I am done....======================");
		
	}
}