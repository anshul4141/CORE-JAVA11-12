package com.rays.javabasic;

public class Exercise10 {

	public static void main(String[] args) {

		int[] i = { 1, 2, 5, 3, 6 };

		int no = 4;
		int temp = -1;

		for (int j = 0; j < i.length; j++) {

			if (no == i[j]) {

				temp = j;

			}

		}
		System.out.println(temp);

	}

}
