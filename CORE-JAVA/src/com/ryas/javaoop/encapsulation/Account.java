package com.ryas.javaoop.encapsulation;

public class Account {

	private String accountNo;
	private String type;
	private double balance;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double deposit(double amount) {

		return this.balance = balance + amount;

	}

	public double withdraw(double amount) {

		if (amount > this.balance) {

			System.out.println("insufficient balance");

		} else {

			return this.balance = balance - amount;

		}

		return this.balance;

	}

}
