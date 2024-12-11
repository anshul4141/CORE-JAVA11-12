package com.rays.collection.streamapi;

import java.util.ArrayList;
import java.util.List;

public class TestStream {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("kamal");
		list.add("aman");
		list.add("pawan");
		list.add("tarun");
		list.add("uday");
		list.add("tanmay");
		list.add("tanmay");

		System.out.println("List: " + list);
		// list.forEach(System.out::println);
		list.forEach(e -> System.out.println(e));
		System.out.println("-----list in upper case-----");
		list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		System.out.println("-----list in lower case-----");
		list.stream().map(e -> e.toLowerCase()).forEach(System.out::println);
		System.out.println("-----list in sorted order-----");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("-----list in upper case with sorted order-----");
		list.stream().map(e -> e.toUpperCase()).sorted().forEach(System.out::println);
		System.out.println("-----remove duplicate from list-----");
		list.stream().distinct().forEach(System.out::println);
		System.out.println("----remove duplicate and sorted order with uppercase");

		System.out.println("-----filter fucntion-----");
		System.out.println("list start with t");
		list.stream().filter(e -> e.startsWith("a")).forEach(System.out::println);

	}

}
