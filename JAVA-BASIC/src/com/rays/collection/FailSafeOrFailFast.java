package com.rays.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class FailSafeOrFailFast {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("KGF");
		list.add('a');
		list.add(2);

		// failFast
		Iterator it = list.iterator();

		// list.add("kalki");

		while (it.hasNext()) {

			System.out.println(it.next());

		}

		System.out.println("--------------");

		Vector v = new Vector();

		v.add("KGF");
		v.add('a');
		v.add(2);

		// failSafe
		Enumeration e = v.elements();

		v.add(5.2);

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

		}

	}

}
