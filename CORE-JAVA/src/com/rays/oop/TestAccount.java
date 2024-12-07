package com.rays.oop;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setNumber("AS455A4555");
		a.setAccountType("saving");
		a.setBalance(100.0);

		System.out.println("Account no = " + a.getNumber());
		System.out.println("Account type = " + a.getAccountType());
		System.out.println("Current balance = " + a.getBalance());

		a.deposit(100.0);
		System.out.println("total balance after deposit = " + a.getBalance());

		a.withdrawal(50.0);
		System.out.println("total balance after withd = " + a.getBalance());
	}

}
