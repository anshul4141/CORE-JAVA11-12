package com.rays.javacolleaction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {

		Collection c = new ArrayList();
		c.add(5);
		c.add('A');
		c.add("KGF");
		c.add(true);
		c.add(5.2);
		c.add(5);

		System.out.println("collection = " + c);
		System.out.println("------------");

		Iterator it = c.iterator();

		while (it.hasNext()) {

			Object ob = it.next();
			System.out.println("collection by iterator = " + ob);

		}

	}

}
