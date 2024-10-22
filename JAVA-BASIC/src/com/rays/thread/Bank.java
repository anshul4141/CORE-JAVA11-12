package com.rays.thread;

public class Bank {

	private int balance;

	public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}

	public synchronized void deposite(String name, int amount) {

		int total = balance + amount;

		setBalance(total);

		System.out.println("total = " + total);

	}

}
