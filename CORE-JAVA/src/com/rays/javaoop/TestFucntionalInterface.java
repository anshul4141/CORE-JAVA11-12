package com.rays.javaoop;

public class TestFucntionalInterface {

	public static void main(String[] args) {

		FIntergaceExample e = new FIntergaceExample() {

			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};

		System.out.println(e.sum(5, 10));

		FIntergaceExample.m1();

		e.m2();

	}

}
