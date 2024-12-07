package com.rays.javabasic;

public class ArmstrongNo {

	public static void main(String[] args) {

		int no = 153;
		int r = 0;
		int temp = no;
		int sum = 0;

		while (temp > 0) {

			r = temp % 10;

			sum = sum + r * r * r;

			temp = temp / 10;

		}

		System.out.println("sum = " + sum);

		if (sum == no) {
			System.out.println("armstrong no");
		} else {
			System.out.println("not armstrong no");
		}

	}

}
