package com.rays.oop.encapsulation;

public class Account {

	private double balance;
	private String accountType;
	private String number;

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getNumber() {
		return number;
	}

	public void setName(String number) {
		this.number = number;
	}

	public double deposit(double amt) {

		return this.balance = this.balance + amt;

	}

	public double withdrawal(double amt) {

		if (amt > this.balance) {
			System.out.println("insufficeant ammount");
		} else {
			return this.balance = this.balance - amt;
		}

		return this.balance;

	}

}
