package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(5);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(6);

		System.out.println("normal list = " + list);

		Collections.shuffle(list);

		System.out.println("shuffle list = " + list);

		Collections.sort(list);

		System.out.println("shorted list = " + list);

		Collections.reverse(list);

		System.out.println("reversed list = " + list);

	}

}
