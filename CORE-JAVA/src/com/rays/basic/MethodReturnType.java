package com.rays.basic;

public class MethodReturnType {

	public int sum(int i, int b) {

		return i + b;

	}

	public static void main(String[] args) {

		MethodReturnType m = new MethodReturnType();

		int s = m.sum(5, 10);
		System.out.println(s);

	}

}
