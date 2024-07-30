package com.rays.javaexception;

public class TestException {

	public static void main(String[] args) {

		int i = 5;

		try {
			System.out.println("Hello");
			System.out.println(i / 0);
			System.out.println(i / 5);

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("done....");

		String str = null;

		try {

			System.out.println(str.length());

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

}
