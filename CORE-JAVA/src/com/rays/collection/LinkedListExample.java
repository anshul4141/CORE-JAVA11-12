package com.rays.collection;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {

		LinkedList fruits = new LinkedList();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");

		System.out.println("Fruits in the list: " + fruits);

		System.out.println("First fruit: " + fruits.get(0));

		fruits.remove("Banana");
		System.out.println("After removing Banana: " + fruits);

		fruits.add(1, "Orange");
		fruits.add(2, "Other");
		System.out.println("After adding Orange and Other at index 1: " + fruits);

	}
}
