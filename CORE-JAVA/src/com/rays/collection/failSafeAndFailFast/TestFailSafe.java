package com.rays.collection.failSafeAndFailFast;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add("KGF");
		v.add(5.2);
		v.add(45);
		v.add(true);
		v.add('a');

		// Fail Safe or Not Fail Fast
		Enumeration e = v.elements();

		v.add("Ram");

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

		}

	}

}
