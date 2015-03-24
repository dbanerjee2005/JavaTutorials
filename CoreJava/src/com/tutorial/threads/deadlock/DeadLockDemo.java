package com.tutorial.threads.deadlock;

public class DeadLockDemo {
	public static String bike = "Bike";
	public static String helmet = "Helmet";
	
	public static void main(String[] args) {
		Thread one = new MyThread();
		one.setName("Red");
		
		Thread two = new YourThread();
		two.setName("Green");

		one.start();
		two.start();
	}

	private static class MyThread extends Thread {
		@Override
		public void run() {
			System.currentTimeMillis();
			
			final String threadName = Thread.currentThread().getName();
			synchronized(helmet) {
				System.out.println(threadName +" has lock on bike and waiting for helmet");
				synchronized(bike) {
					System.out.println(threadName +" has lock on both Resource");
				}
			}
		}
	}
	
	private static class YourThread extends Thread {
		@Override
		public void run() {
			final String threadName = Thread.currentThread().getName();
			synchronized(helmet) {
				System.out.println(threadName +" has lock on Helmet and waiting for bike");
				synchronized(bike) {
					System.out.println(threadName +" has lock on both Resource");
				}
			}
		}
	}
}
