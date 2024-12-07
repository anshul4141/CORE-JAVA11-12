package com.rays.javabasic;

public class ForEach {

	public static void main(String[] args) {

		int[] i = { 1, 5, 9, 8, 10 };

		System.out.println(i[0] + " " + i[1]);

		// for each loop
		for (int a : i) {

			System.out.println(a);

		}

		System.out.println("----------------------");

		// for loop
		for (int j = 0; j < i.length; j++) {

			System.out.println(i[j]);

		}

	}

}
