package com.rays.javabasic;

public class Armstrong {

	public static void main(String[] args) {

		int a = 153;
		int sum = 0;
		int r = 0;
		int num = a;

		while (num > 0) {

			r = num % 10;
			sum = sum + r * r * r;
			num = num / 10;

		}

		System.out.println(sum);

		if (a == sum) {

			System.out.println("this is armstrong no.");

		} else {
			System.out.println("this is not armstrong no.");
		}

	}

}
