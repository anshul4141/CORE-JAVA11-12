package com.rays.javastring;

public class TestString {

	public static void main(String[] args) {

		// literal pool
		String s1 = "xyz";
		String s3 = "xyzz";

		// heap memory
		String s2 = new String("xyz");

		// ==, .equals

		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));

	}

}
