package com.rays.thread;

public class TestByThread {

	public static void main(String[] args) {

		ByThread t1 = new ByThread("Ram");

		ByThread t2 = new ByThread("Shyam");

		t1.setPriority(10);
		t1.setPriority(1);

		t1.start();
		t2.start();

	}

}
