package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestStreamAPI {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("tarun");
		list.add("tarun");
		list.add("taman");
		list.add("aman");
		list.add("ram");
		list.add("shyam");

		System.out.println("normal list = " + list);
		System.out.println("----------------------");

		System.out.println("sorted list by stream");
		list.stream().sorted().forEach(System.out::println);

		System.out.println("list in uppercase by stream");
		list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);

		System.out.println("remove dubplicate data from list");
		list.stream().distinct().forEach(System.out::println);

		System.out.println("start with t");
		list.stream().filter(e -> e.startsWith("t")).distinct().limit(1).forEach(System.out::println);

	}

}
