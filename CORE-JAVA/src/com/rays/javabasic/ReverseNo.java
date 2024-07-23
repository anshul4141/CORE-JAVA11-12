package com.rays.javabasic;

public class ReverseNo {

	public static void main(String[] args) {

		int i = 151;
		int reverse = 0;
		int r = 0;
		int num = i;

		while (num > 0) {

			r = num % 10;
			reverse = (reverse * 10) + r;
			num = num / 10;

		}

		System.out.println(reverse);

		if (i == reverse) {

			System.out.println("no is palindrome");

		} else {
			System.out.println("no is not palindrome");
		}

	}

}
