package com.rays.exception;

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

	public double withdrawal(double amt) throws InsufficientFundException {

		if (amt > this.balance) {

			throw new InsufficientFundException("Insufficent fund transfer");

		} else {
			return this.balance = this.balance - amt;
		}

	}

}
