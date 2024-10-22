package com.rays.thread;

public class AccountHolder extends Thread {

	String name;

	public static Bank b = new Bank();

	public AccountHolder(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			b.deposite(name, 1000);
		}

	}

}