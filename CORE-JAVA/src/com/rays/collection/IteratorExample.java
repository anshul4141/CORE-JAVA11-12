package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(2);
		c.add(5.2);
		c.add("KGF");
		c.add('a');
		c.add(true);
		
		System.out.println(c);
		System.out.println("----------iterator----------");

		Iterator it = c.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}
	}

}
