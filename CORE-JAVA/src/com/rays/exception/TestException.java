package com.rays.exception;

public class TestException {

	public static void main(String[] args) {

		int no = 5;

		try {

			int i = no / 0;

			System.out.println(i);

		} catch (ArithmeticException e) {

			System.out.println("exception = " + e.getMessage());

		} finally {
			System.out.println("this is finally block");
		}

		System.out.println("programe is end");

	}

}
