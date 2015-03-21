package com.tutorial.threads.test;

//public class Horse extends Thread {

//Horse extends Animal implements Runnable

public class Horse implements Runnable {
	String name;
	public Horse(String name) {
		this.name = name;
	}
	
	public Horse() {
	}
	
	@Override
	public void run() {
		synchronized(this){
			for(int i = 0 ; i < 5 ; i++) {
				System.out.println("Horse is running from Thread >>> ["+i+"]"
						+ "   "+Thread.currentThread().getName());
			}
		}
	}
}