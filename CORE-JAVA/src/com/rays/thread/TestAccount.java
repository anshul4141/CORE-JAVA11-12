package com.rays.thread;

public class TestAccount extends Thread {

	String name;

	public static Account a = new Account();

	public TestAccount(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			a.deposite(name, 1000);
		}

	}

	public static void main(String[] args) {

		TestAccount t1 = new TestAccount("Ram");
		TestAccount t2 = new TestAccount("Shyam");

		t1.start();
		t2.start();

	}

}
