package com.rays.basic;

public class Methods {

	public void greeting() {

		System.out.println("hello world");

	}

	public void add(int i, int b) {

		System.out.println("sum = " + (i + b));

	}

	public static void main(String[] args) {

		Methods m = new Methods();

		m.greeting();
		m.add(5, 10);
	}

}
