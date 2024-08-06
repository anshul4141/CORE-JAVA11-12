package com.rays.javacollection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet lh = new LinkedHashSet();

		lh.add(5);
		lh.add("hello");

		lh.forEach(System.out::println);

	}

}
