package com.rays.oop;

public class Account {

	private String number;
	private String accountType;
	private double balance;

	public String getNumber() {

		return this.number;

	}

	public void setNumber(String number) {

		this.number = number;

	}

	public String getAccountType() {

		return accountType;

	}

	public void setAccountType(String accountType) {

		this.accountType = accountType;

	}

	public double getBalance() {

		return balance;

	}

	public void setBalance(double balance) {

		this.balance = balance;

	}

	public void deposit(double amount) {

		this.balance = this.balance + amount;

	}

	public void withdrawal(double amount) {

		this.balance = this.balance - amount;

	}

}
