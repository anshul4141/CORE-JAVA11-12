package com.rays.collection;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {

		// AutoBoxing
		int a = 5;

		Integer i = new Integer(a);

		System.out.println(i);
		
		// UnBoxing
		int a1 = i;
		
		System.out.println(a1);

	}

}
