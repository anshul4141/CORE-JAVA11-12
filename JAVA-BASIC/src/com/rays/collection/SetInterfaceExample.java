package com.rays.collection;

import java.util.HashSet;
import java.util.Set;


// set order is sorting order
// set contain only one null value
// set dose not contain dubplicate value
public class SetInterfaceExample {

	public static void main(String[] args) {

		Set s = new HashSet();

		s.add(5);
		s.add(2);
		s.add(3);
		s.add('a');
		s.add(4);

		System.out.println("set = " + s);

	}

}
