package com.rays.string;

public class HeapAndLiteral {

	public static void main(String[] args) {

		// Literal pool memory
		String str1 = "Ram";

		// Heap memory
		String str2 = new String("Ram");

		// == operator check refrence
		System.out.println(str1 == str2);

		// .equals check value
		System.out.println(str1.equals(str2));

	}

}
