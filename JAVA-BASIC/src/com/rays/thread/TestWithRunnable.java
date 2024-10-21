package com.rays.thread;

public class TestWithRunnable {

	public static void main(String[] args) {

		Thread t1 = new Thread(new WithRunnable("Ram"));
		Thread t2 = new Thread(new WithRunnable("Shyam"));

		t1.start();
		t2.start();

	}

}
