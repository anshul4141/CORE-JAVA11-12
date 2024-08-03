package com.rays.javacolleaction;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// list contain multiple null value
// list contain multiple duplicate value
// list always in natural order
public class TestListInterface {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(5);
		list.add('a');
		list.add('a');
		list.add(null);
		list.add(null);
		list.add("kgf");

		// System.out.println(list.indexOf("kgf"));
		// list.set(5, "kalki");

		list.add(5, "kgf2");

		ListIterator lit = list.listIterator();

		while (lit.hasNext()) {

			System.out.println(lit.next());

		}

	}

}
