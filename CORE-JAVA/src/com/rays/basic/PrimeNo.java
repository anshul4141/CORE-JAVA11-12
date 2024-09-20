package com.rays.basic;

public class PrimeNo {

	public static void main(String[] args) {

		int no = 8;
		int count = 0;

		for (int i = 2; i < no; i++) {

			if (no % i == 0) {

				count++;

			}

		}

		if (count == 0) {
			System.out.println("prime no");
		} else {
			System.out.println("not prime no");
		}

	}

}
