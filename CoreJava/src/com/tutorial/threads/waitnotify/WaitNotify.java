package com.tutorial.threads.waitnotify;

public class WaitNotify {

	public static void main(String[] args) {
		CalculateThread calcThread = new CalculateThread();
		calcThread.start();
		
		synchronized(calcThread) {
			System.out.println("Main Thread is waiting for Calculater thread to finish");
			try {
				calcThread.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(calcThread.total);
	}
}

class CalculateThread extends Thread {
	int total;
	@Override
	public void run() {
		synchronized(this) {
			for(int i = 0 ; i < 10; i++) {
				total += i;
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			notify();
		}
	}
}
