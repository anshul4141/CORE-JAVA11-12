package com.rays.javabasic;

public class PrimeNo {

	public static void main(String[] args) {

		int i = 4;
		int count = 0;

		for (int a = 2; a < i; a++) {

			if (i % a == 0) {

				count++;

			}

		}

		if (count > 0) {

			System.out.println("this is not prime no");

		} else {
			System.out.println("this is prime no");
		}

	}

}
