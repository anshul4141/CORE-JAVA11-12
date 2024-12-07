package com.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

	public static void main(String[] args) {
		SortedSet set = new TreeSet();

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(45);
		set.add(50);
		set.add(10);
		set.add(5);

		System.out.println("Original Set: " + set);

		System.out.println("retrun fist element of sorted set = " + set.first());
		System.out.println("return last element of sorted set = " + set.last());

		// Returns elements less than the specified value
		SortedSet headSet = set.headSet(30);
		System.out.println("headSet(30): " + headSet);

		// Returns elements greater than or equal to the specified value
		SortedSet tailSet = set.tailSet(30);
		System.out.println("tailSet(30): " + tailSet);

		SortedSet subSet = set.subSet(20, 50);
		System.out.println("subSet(20, 50): " + subSet);
	}
}
