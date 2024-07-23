package com.rays.javaoop;

public class Methods {

	// method first word in small letters rest in camel case
	// void means no return type
	public void testMethod1() {
		System.out.println("this is simple mathod");
	}

	public int sum(int a, int b) {

		int sum = a + b;

		return sum;

	}

	public static void main(String[] args) {

		Methods m = new Methods();

		m.testMethod1();
		int sum = m.sum(5, 10);
		System.out.println(sum);

	}
}
