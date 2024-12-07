package com.rays.collection.failSafeAndFailFast;

import java.util.ArrayList;
import java.util.Iterator;

public class TestFailFast {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("abc");
		list.add(52);
		list.add('a');

		// fail fast
		Iterator it = list.iterator();

		// ConcurrentModificationException
		list.add(true);

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
