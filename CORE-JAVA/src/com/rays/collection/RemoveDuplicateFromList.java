package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(25);
		l.add("KGF");
		l.add('a');
		l.add(25.1);
		l.add(true);
		l.add("KGF");
		l.add("KGF");
		l.add("Aaman");

		List ul = new ArrayList();

		Iterator it = l.iterator();

		while (it.hasNext()) {

			Object current = it.next();

			Iterator uit = ul.iterator();

			while (uit.hasNext()) {

				Object unique = uit.next();

				if ((current == null && unique == null) || (current != null && current.equals(unique))) {

					current = null;

					break;

				}

			}

			if (current != null) {

				ul.add(current);

			}
		}

		System.out.println("List after removing duplicates: " + ul);
	}
}
