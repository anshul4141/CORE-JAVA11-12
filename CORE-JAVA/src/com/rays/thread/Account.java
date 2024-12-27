package com.rays.thread;

public class Account {

	private int balance;

	public int getBalance() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}

	public void deposite(String name, int amount) {

		synchronized (this) {

			int total = balance + amount;

			setBalance(total);
		}
		System.out.println(name + " " + balance);

	}

//	public synchronized void deposite(String name, int amount) {
//
//		int total = balance + amount;
//
//		setBalance(total);
//
//		System.out.println(name + " " + balance);
//
//	}

}
