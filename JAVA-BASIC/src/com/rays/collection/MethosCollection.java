package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class MethosCollection {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add(5);
		c1.add(56.2);
		c1.add("KGF");
		c1.add(true);
		c1.add('a');

		System.out.println("size of c1 = " + c1.size());

		c1.remove('a');

		System.out.println("c1 = " + c1);

		Collection c2 = new ArrayList();

		c2.add(6);
		c2.add(2.1);
		c2.add("KGF");
		c2.add(false);
		c2.add('b');

		System.out.println("c2 = " + c2);

//		c1.addAll(c2);
//
//		System.out.println("c1 and c2 = " + c1);

//		c1.removeAll(c2);
//
//		System.out.println("c1 = " + c1);

		c1.retainAll(c2);

		System.out.println("retain of c1 or c2 = " + c1);

		c1.clear();

		System.out.println("after clear = " + c1);

	}

}
