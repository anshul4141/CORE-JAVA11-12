package com.rays.oop.methodOverlodin;

// same method with diffrent param and diffrent data types is called mehthod overloding
public class MethodOverloding {

	public void sum(int a, int b) {

		System.out.println("sum of two no = " + (a + b));

	}

	public void sum(int a, int b, int c) {

		System.out.println("sum of three no = " + (a + b + c));

	}

	public void sum(double a, double b) {

		System.out.println("sum of two double no = " + (a + b));

	}

}
