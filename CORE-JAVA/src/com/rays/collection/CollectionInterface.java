package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(2);
		c.add(5.2);
		c.add("KGF");
		c.add('a');
		c.add(true);

		if (c.isEmpty()) {

			System.out.println("c = " + c);

		}

		System.out.println(c.contains('b'));

		Collection c2 = new ArrayList();

		c2.add("Ram");
		c2.add("KGF");

		c2.retainAll(c);

		System.out.println("retain values of c and c2 = " + c2);

		c2.addAll(c);

		System.out.println(c2.containsAll(c));

		System.out.println("c2 = " + c2);
		System.out.println("------forEach-Loop-------");

		for (Object o : c) {

			System.out.println(o);

		}

	}

}
