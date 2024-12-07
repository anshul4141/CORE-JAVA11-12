package com.rays.oop.inheritance;

// method OverLoading is same method with Different parameter and Different Numbers of parameter
public class Sum {

	public void sum(int a, int b) {

		System.out.println("sum of two int no = " + (a + b));

	}

	public void sum(double a, double b) {

		System.out.println("sum of two double no = " + (a + b));

	}

	public void sum(int a, int b, int c) {

		System.out.println("sum of three int no = " + (a + b + c));

	}

}
