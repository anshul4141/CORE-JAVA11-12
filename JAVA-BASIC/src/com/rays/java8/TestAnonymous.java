package com.rays.java8;

public class TestAnonymous {

	public static void main(String[] args) {

		FunctionalInt f = new FunctionalInt() {

			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};

		int a = 5;
		int b = 10;

		System.out.println(f.sum(a, b));
		FunctionalInt.m1();
		f.m2();

	}

}
