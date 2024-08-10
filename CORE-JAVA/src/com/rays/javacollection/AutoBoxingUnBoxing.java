package com.rays.javacollection;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {

		// autoboxing
		int i = 5;
		Integer i1 = new Integer(i);

		System.out.println(i1);

		// autounboxing
		int a = i1;
		System.out.println(a);

	}

}
