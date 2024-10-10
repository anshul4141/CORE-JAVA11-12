package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(5);
		c.add(56.2);
		c.add("KGF");
		c.add(true);
		c.add('a');

		System.out.println("c = " + c);

		System.out.println("--------forEach--------");

		for (Object e : c) {

			System.out.println(e);

		}

		System.out.println("----------Iterator----------");

		Iterator it = c.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
