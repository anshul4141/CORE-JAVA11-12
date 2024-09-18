package com.rays.basic;

public class Swaping {

	public static void main(String[] args) {

		// with third variable
		int a = 5;
		int b = 10;
		int c = 0;

		c = a;
		a = b;
		b = c;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// without third variable
		int i = 12;
		int j = 14;
		
		i = i+j; // i = 26
		j = i - j;	// j = 	12
		i = i - j; // i = 14
		
		System.out.println(j);
		System.out.println(i);
		
		

	}

}
