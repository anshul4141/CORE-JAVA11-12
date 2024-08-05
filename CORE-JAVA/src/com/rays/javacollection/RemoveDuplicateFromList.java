package com.rays.javacollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add("kgf");
		l.add("kgf");
		l.add("abc");
		l.add('a');

		System.out.println(l);

		for (int i = 0; i < l.size(); i++) {

			for (int j = i + 1; j < l.size(); j++) {

				if (l.get(i).equals(l.get(j))) {

					l.remove(j);

				}

			}

		}

		Iterator it = l.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
