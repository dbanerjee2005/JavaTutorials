package com.tutorial.threads.sync;

public class AccountClients {

	public static void main(String[] args) {
		Runnable accountHolder = new AccountHolder();
		
		Thread sudheer = new Thread(accountHolder , "Sudheer");
		Thread debashis = new Thread(accountHolder , "Debashis");
		
		sudheer.start();
		debashis.start();
		
	}
}