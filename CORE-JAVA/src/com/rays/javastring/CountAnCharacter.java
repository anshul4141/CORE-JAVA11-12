package com.rays.javastring;

public class CountAnCharacter {

	public static void main(String[] args) {

		String name = "naman";
		int count = 0;

		System.out.println("lenght of name = " + name.length());

		for (int i = 0; i < name.length(); i++) {

			if ('a' == name.charAt(i)) {

				count++;

			}

		}

		if (count != 0) {

			System.out.println("a = " + count);

		} else {
			System.out.println("a is not found");
		}

	}

}
