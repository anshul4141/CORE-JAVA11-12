package com.rays.thread;

public class TestByRnnable {

	public static void main(String[] args) {

		Thread t1 = new Thread(new ByRnnable("abc"));
		Thread t2 = new Thread(new ByRnnable("def"));

		t1.start();
		t2.start();

	}

}
