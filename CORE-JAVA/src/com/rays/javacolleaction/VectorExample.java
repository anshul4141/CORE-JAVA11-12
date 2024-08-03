package com.rays.javacolleaction;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement(5);
		v.add('a');

		System.out.println(v);

		Enumeration e = v.elements();
		
		v.add("abc");

		while (e.hasMoreElements()) {
			Object object = e.nextElement();
			System.out.println(object);

		}

	}

}
