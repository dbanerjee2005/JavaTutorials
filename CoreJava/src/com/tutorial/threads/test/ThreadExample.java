package com.tutorial.threads.test;

public class ThreadExample {
	public static void main(String[] args) {
		System.out.println("Hello Guys.. I am sleeping..");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName());
		
		Horse badal = new Horse("Badal");
		Horse raka = new Horse("Raka");
		
		Thread badalThread = new Thread(badal, "Badal");
		Thread rakaThread = new Thread(raka, "Raka");
		
		badalThread.start();
		rakaThread.start();
		
		System.out.println("==================I am done....======================");
	}
}