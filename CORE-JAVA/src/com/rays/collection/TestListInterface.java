package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// List Contain Multiple null values
// List Contain Multiple Duplicate Values
// Order Of list Is Natural Order
public class TestListInterface {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(25);
		l.add("KGF");
		l.add('a');
		l.add(25.1);
		l.add(true);
		l.add("KGF");
		l.add(null);
		l.add(null);
		l.add("KGF");
		l.add("Aaman");

		System.out.println(l.get(l.size() / 2));

		System.out.println("list = " + l);

		System.out.println("value of 8 index = " + l.get(8));

		l.remove(8);

		l.set(0, 52);

		System.out.println("new list = " + l);

		System.out.println("Sub list = " + l.subList(0, 4));

		System.out.println("index of 52 = " + l.indexOf(52));

		System.out.println("index of KGF = " + l.indexOf("KGF"));

		System.out.println("last index of KGF = " + l.lastIndexOf("KGF"));

		Iterator it = l.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
