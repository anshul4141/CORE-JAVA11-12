package com.rays.thread;

public class Account {

	public int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public synchronized void deposit(String name, int amount) {

		int amt = getBalance();

		amt = amt + amount;

		setBalance(amt);

		System.out.println(name + "new balace " + amt);

//		synchronized (name) {
//
//			int amt = getBalance();
//
//			amt = amt + amount;
//
//			setBalance(amt);
//
//			System.out.println(name + "new balace " + amt);

//		}

	}

}
