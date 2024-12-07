package com.rays.javabasic;

public class StringBufferExample {

	public static void main(String[] args) {

		// StringBuffer is mutable
		StringBuffer sb = new StringBuffer("Hello");

		System.out.println(sb);

		sb.append(" Ram.");

		System.out.println(sb);

	}

}
