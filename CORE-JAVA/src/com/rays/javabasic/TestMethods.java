package com.rays.javabasic;

public class TestMethods {

	public static void main(String[] args) {

		Methods m = new Methods();

		m.sum(5, 10);

		int a = m.multiply(5, 5);

		System.out.println(a);

		String s = m.hello("Hello World");
		
		System.out.println(s);

	}

}
