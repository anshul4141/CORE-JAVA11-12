package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add("KGF");
		v.add(45);
		v.add('a');
		v.add(5.2);

		System.out.println("v = " + v);

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

		}

	}

}
