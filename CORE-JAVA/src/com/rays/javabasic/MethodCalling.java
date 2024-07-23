package com.rays.javabasic;

public class MethodCalling {

	public void sum(int a, int b) {

		System.out.println("sum = " + (a + b));

	}

	public void multi(int a, int b) {

		System.out.println("mult = " + (a * b));

	}

	public static void main(String[] args) {

		MethodCalling m = new MethodCalling();

		m.sum(5, 15);
		m.multi(2, 4);

	}

}
