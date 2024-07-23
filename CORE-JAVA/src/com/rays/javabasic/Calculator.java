package com.rays.javabasic;

public class Calculator {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		char oprator = '-';

		switch (oprator) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(b - a);
			break;
		default:
			break;
		}

	}

}
