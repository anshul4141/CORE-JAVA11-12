package com.rays.javabasic;

public class TypeCasting {

	public static void main(String[] args) {

		int i = 1;
		double d;
		char c = 'S';

		// converting int to double
		d = i;
		System.out.println("int -> double = " + d);

		// converting double to int
		i = (int) d;
		System.out.println("double -> int = " + i);

		// converting char to double
		d = c;
		System.out.println("char --> double = " + d);

		// converting double to char
		c = (char) d;
		System.out.println("double --> char = " + c);

	}

}
