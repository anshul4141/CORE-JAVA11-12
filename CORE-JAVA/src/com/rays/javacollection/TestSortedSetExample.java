package com.rays.javacollection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSetExample {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add('2');
		//s.add(3);
		s.add('1');
		//s.add(4);
		//s.add(2);
		
		System.out.println(s);

	}

}