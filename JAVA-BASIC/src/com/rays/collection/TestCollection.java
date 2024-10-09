package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(5);
		c.add("KGF");
		c.add(5.2);
		c.add(true);
		c.add('a');

		System.out.println("collection = " + c);
		System.out.println("---------forEach---------");

		for (Object o : c) {

			System.out.println(o);

		}

		System.out.println("--------Iterator--------");

		Iterator i = c.iterator();

		while (i.hasNext()) {

			Object o1 = i.next();

			System.out.println(o1);

		}

	}

}
