package com.tutorial.threads.waitnotify;

public class WaitNotifyAll {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		Reader oneR = new Reader(calc);
		oneR.start();
		new Reader(calc).start();
		new Reader(calc).start();
		
		calc.start();
	}
}

class Reader extends Thread {
	Calculator calc;
	public Reader(Calculator calc) {
		this.calc = calc;
	}
	@Override
	public void run() {
		synchronized(calc) {
			System.out.println("Waiting for the calculator to finish...");
			try{
				calc.wait();
			}catch(Exception exp) {
				exp.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + " Total is " + calc.total);
		}
	}
}

class Calculator extends Thread {
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
			notifyAll();
		}
	}
}
