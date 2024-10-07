package com.rays.exception;

public class TestException {

	public static void main(String[] args) {

		int i = 5;
		String str = null;

		try {

			System.out.println(i / 5);
			System.out.println(str.length());

		} catch (RuntimeException e) {

			System.out.println(e.getMessage() + " in catch block");

		} finally {
			System.out.println("this is finally block");
		}

		System.out.println("hello..");

	}

}
