package com.rays.javabasic;

public class FabonacciSeries {

	public static void main(String[] args) {

		int a = 0;

		int b = 1;

		int c;

		for (int i = 1; i <= 10; i++) {

			c = a + b;

			System.out.print(a + " ");

			a = b;
			b = c;

		}
	}

}
