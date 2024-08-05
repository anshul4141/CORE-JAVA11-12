package com.rays.javacollection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();
		c.add(5);
		c.add('A');
		c.add("KGF");
		c.add(true);
		c.add(5.2);
		c.add(5);

		Collection c2 = new ArrayList();

		c2.add(15);
		c2.add('B');
		c2.add("KGF");
		c2.add(false);
		c2.add(5.2);
		c2.add(5);

		c.addAll(c2);
		// c.retainAll(c2);
		c.removeAll(c2);
		System.out.println(c);

		// System.out.println(c);

//		System.out.println(c.isEmpty());
//
//		System.out.println("Collection = " + c);
//		System.out.println("-----------");
//		System.out.println(c.contains(5));
//		System.out.println("-----------");
//		System.out.println(c.size());
//		c.remove(5);
//		System.out.println(c);

	}

}
