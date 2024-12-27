package com.rays.java8;

public class TestAonymousFunction {

	public static void main(String[] args) {

		FunctionalInt f = new FunctionalInt() {

			@Override
			public int sum(int i, int j) {

				return i + j;
			}
		};

		int i = 5;
		int j = 10;
		System.out.println(f.sum(i, j));

		f.m1();
		FunctionalInt.m2();

	}

}
