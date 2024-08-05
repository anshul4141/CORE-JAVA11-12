package com.rays.javacollection;

import java.util.HashSet;
import java.util.Set;

// Set does not contain duplicate elements
// Set contain only one null value
// Set dose not contain any order
public class TestSetInterface {

	public static void main(String[] args) {

		Set s = new HashSet();

		s.add("kalki");
		s.add("kalki");
		s.add(null);
		s.add(null);
		s.add(5);
		s.add('a');

		System.out.println(s);

	}

}
