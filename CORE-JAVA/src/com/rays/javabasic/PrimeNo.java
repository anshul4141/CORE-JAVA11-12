package com.rays.javabasic;

public class PrimeNo {

	public static void main(String[] args) {

		int no = 8;

		int count = 0;

		for (int a = 2; a < no; a++) {

			if (no % a == 0) {

				count++;

			}

		}

		if (count == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

	}

}
