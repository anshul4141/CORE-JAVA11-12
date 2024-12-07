package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestVactor {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add("KGF");
		v.add(5.2);
		v.add(45);
		v.add(true);
		v.add('a');

		System.out.println("vector = " + v);

		System.out.println("--------Enumeration---------");

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());
		}

	}

}
