package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// list order is natural order
// list contain multiple null or duplicate values
public class ListInterfaceExample {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(5);
		list.add('a');
		list.add("KGF");
		list.add("KGF");
		list.add(null);
		list.add(null);

		System.out.println("index of a = " + list.indexOf('a'));

		System.out.println("subList = " + list.subList(1, 4));

		list.set(1, 'b');

		System.out.println("list = " + list);

		System.out.println("get value of 1st index = " + list.get(1));

		System.out.println("-------Iterator-------");

		Iterator it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

		System.out.println("-------forEachMethod-------");

		list.forEach(System.out::println);

	}

}
