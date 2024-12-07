package com.rays.javabasic;

public class ReverseAndPalindrome {

	public static void main(String[] args) {

		int num = 132;
		int r = 0;
		int sum = 0;
		int num2 = num;

		while (num2 != 0) {

			r = num2 % 10;
			sum = (sum * 10) + r;
			num2 = num2 / 10;

		}
		System.out.println("reverse no. " + sum);

		if (sum == num) {

			System.out.println("palindrome");

		} else {
			System.out.println("not palindrome");
		}

	}

}
