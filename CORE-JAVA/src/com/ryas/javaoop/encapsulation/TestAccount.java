package com.ryas.javaoop.encapsulation;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setAccountNo("ASD1234");
		a.setType("saving");
		a.setBalance(100.0);

		System.out.println("total balance = " + a.getBalance());

		a.deposit(1400.0);

		System.out.println("total balance after deposit" + a.getBalance());

		a.withdraw(200.0);

		System.out.println("total balance = " + a.getBalance());

	}

}
