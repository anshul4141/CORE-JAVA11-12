package com.rays.thread;

public class TestWithThread {

	public static void main(String[] args) {

		WithThread t1 = new WithThread("Ram");
		WithThread t2 = new WithThread("Shyam");
		
		t1.setPriority(10);
		
		t1.start();
		t2.start();

	}

}
