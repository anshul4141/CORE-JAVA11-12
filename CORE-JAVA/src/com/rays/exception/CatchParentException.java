package com.rays.exception;

public class CatchParentException {

	public static void main(String[] args) {

		String name = null;

		try {

			System.out.println(name.length());
			System.out.println(name.charAt(4));

		} catch (RuntimeException e) {

			System.out.println("exception no 1 = " + e.getMessage());

		}

		System.out.println("next programe");

	}

}
