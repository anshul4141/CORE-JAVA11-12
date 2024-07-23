package com.rays.javastring;

public class StringMethods {

	public static void main(String[] args) {

		String name = "Vijay Dinanath Chouhan";

		System.out.println(name);

		System.out.println("String lenght = " + name.length());
		System.out.println(name.charAt(6));
		System.out.println(name.substring(6));
		System.out.println("bada vijay = " + name.toUpperCase());
		System.out.println("chota vijay = " + name.toLowerCase());
		System.out.println("replace a to b = " + name.replace('a', 'b'));
		System.out.println(name);


	}

}
