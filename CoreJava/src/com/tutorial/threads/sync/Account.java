package com.tutorial.threads.sync;

public class Account {
	private int balance = 50;
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int withdrawAmount) {
		balance = balance - withdrawAmount;
	}
}