package com.rays.exception;

public class MultipleException {

	public static void main(String[] args) {

		String name = "Ram";

		try {

			System.out.println(name.length());
			System.out.println(name.charAt(4));

		} catch (NullPointerException e) {

			System.out.println("exception no 1 = " + e.getMessage());

		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("excpetion no 2 = " + e.getMessage());

		}

		System.out.println("next programe");

	}

}
