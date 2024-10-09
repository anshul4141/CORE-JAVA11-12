package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class MethodsCollection {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add(5);
		c1.add("KGF");
		c1.add(5.2);
		c1.add(true);
		c1.add('a');

		System.out.println("c1 = " + c1);

		Collection c2 = new ArrayList();

		c2.add(5);
		c2.add("KGF");
		c2.add(8.6);

		c1.retainAll(c2);

		System.out.println(c1);

		System.out.println("c2 = " + c2);

		// c2.clear();

		c1.addAll(c2);

		System.out.println("c1 and c2 = " + c1);

		c1.removeAll(c2);

		System.out.println("c1 after remove c2 = " + c1);

//		c1.remove(5);
//
//		System.out.println("c1 and c2 after remove = " + c1);

	}

}
