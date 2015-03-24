package com.tutorial.threads.sync;

public class AccountHolder implements Runnable {
	Account account = new Account();
	
	public synchronized void run() {
		for (int i = 0; i < 5; i++) {
			makeWithdraw(10);

			if(account.getBalance() < 0) {
				System.out.println(" Account is overdrawn !!!");
			}
		}
	}
	private void makeWithdraw(int amt) {
		if (account.getBalance() >= amt) {
			account.withdraw(amt);
		} else {
			System.out.println("Not enought money for "
					+ Thread.currentThread().getName() + " because current balance is : " + account.getBalance());
		}
	}
}
