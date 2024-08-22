package com.rays.thread;

public class RacingCondition extends Thread {

	public static Account data = new Account();

	public String name;

	public RacingCondition(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			data.deposit(name, 1000);

		}
	}

	public static void main(String[] args) {

		RacingCondition r1 = new RacingCondition("Ram");

		RacingCondition r2 = new RacingCondition("Shyam");

		r1.start();
		r2.start();

	}

}
