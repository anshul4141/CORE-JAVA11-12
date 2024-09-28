package com.rays.oop.encapsulation;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setBalance(1000.0);
		System.out.println("Total balance = " + a.getBalance());
		a.setAccountType("Saving Account");
		System.out.println("Account type = " + a.getAccountType());
		a.setName("SSDD45514567G");
		System.out.println("Account no = " + a.getNumber());

		System.out.println("---------------");

		a.deposit(500.0);
		System.out.println("Total Amount after deposit = " + a.getBalance());
		a.withdrawal(200.0);
		System.out.println("Finle Amount = " + a.getBalance());

	}

}
