package com.rays.javabasic;

public class HeapAndLateral {

	public static void main(String[] args) {

		// String is immutable
		
		// Lateral pool
		String s1 = "rays";
		String s2 = "rays";

		// Heap memory Area
		String s3 = new String("rays");
		String s4 = new String("sunrays");

		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));

		System.out.println(s1.equals(s3));

		System.out.println(s1 == s3);

	}

}
