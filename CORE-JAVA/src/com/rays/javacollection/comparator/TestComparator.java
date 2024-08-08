package com.rays.javacollection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();

		list.add(new Student("Raman", 4, 105));
		list.add(new Student("Aman", 1, 101));
		list.add(new Student("Kamal", 2, 103));
		list.add(new Student("Raman", 5, 104));
		list.add(new Student("Nikhil", 3, 102));

		SortById byid = new SortById();

		Collections.sort(list, byid);

		System.out.println("Sort By Id ==== ");
		list.forEach(System.out::println);
		
		SortByName byName = new SortByName();
		
		Collections.sort(list, byName);
		
		System.out.println("Sort By Name ==== ");
		list.forEach(System.out::println);

	}

}
