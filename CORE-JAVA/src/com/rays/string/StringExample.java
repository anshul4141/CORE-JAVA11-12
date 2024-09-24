package com.rays.string;

public class StringExample {

	public static void main(String[] args) {

		String name = "Vijay Dinanath Chouhan";

		System.out.println("Name : " + name);
		System.out.println("Lenght : " + name.length());
		System.out.println("7th character = " + name.charAt(6));
		System.out.println("index of = " + name.indexOf("Dina"));
		System.out.println("last index of = " + name.lastIndexOf("a"));
		System.out.println("a replac by b = " + name.replace('a', 'b'));
		System.out.println("chota vijay = " + name.toLowerCase());
		System.out.println("bada vijay = " + name.toUpperCase());
		System.out.println("name is start with ch = " + name.startsWith("ch"));
		System.out.println("name is start with Vi = " + name.startsWith("Vi"));
		System.out.println("name is ends with Vi = " + name.endsWith("Vi"));
		System.out.println("name is ends with an = " + name.endsWith("an"));
		System.out.println("sub string = " + name.substring(6));
		System.out.println(name.substring(6, 8));

	}

}
