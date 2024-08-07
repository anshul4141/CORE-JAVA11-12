package com.rays.javacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// list contain multiple null value
// list contain multiple duplicate value
// list always in natural order
public class TestListInterface {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(5);
		list.add(4);
		list.add(3);

		System.out.println(list);
		System.out.println("-------------");

		Collections.sort(list);

		System.out.println(list);

		System.out.println("------------");

		Collections.shuffle(list);

		System.out.println(list);

//		list.forEach(System.out::println);
//
//		// System.out.println(list.indexOf("kgf"));
//		// list.set(5, "kalki");
//
//		list.add(5, "kgf2");
//
//		ListIterator lit = list.listIterator();
//
//		while (lit.hasNext()) {
//
//			System.out.println(lit.next());
//
//		}

	}

}
