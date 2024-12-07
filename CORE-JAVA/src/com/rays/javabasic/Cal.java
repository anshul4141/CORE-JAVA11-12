package com.rays.javabasic;

public class Cal {

	public static void main(String[] args) {

		String opr = "-";

		int a = 5;
		int b = 10;

		switch (opr) {
		case "+":
			System.out.println("sum of two no = " + (a + b));
			break;
		case "-":
			System.out.println("substraction of two no = " + (a - b));
			break;
		default:
			break;
		}

	}

}
