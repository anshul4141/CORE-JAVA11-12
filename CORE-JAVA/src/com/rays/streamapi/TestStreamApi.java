package com.rays.streamapi;

import java.util.ArrayList;
import java.util.List;

public class TestStreamApi {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("suman");
		list.add("aman");
		list.add("kuman");
		list.add("tarun");
		list.add("tanmay");

		System.out.println("simple list = ");
		list.forEach(System.out::println);

		System.out.println("list in uppercase = ");
		list.stream().map(e -> e.toUpperCase()).limit(2).forEach(System.out::println);

		System.out.println("list in lowercase = ");
		list.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));

		System.out.println("remove duplicat element from stream = ");
		list.stream().distinct().forEach(System.out::println);

		System.out.println("remove duplicat element from stream & in uppercase");
		list.stream().distinct().map(e -> e.toUpperCase()).forEach(System.out::println);

		System.out.println("sortin list = ");
		list.stream().sorted().map(e -> e.toLowerCase()).forEach(System.out::println);

		System.out.println("list start with t");
		list.stream().filter(e -> e.startsWith("t")).forEach(System.out::println);
		list.stream().filter(e -> e.startsWith("t")).map(e -> e.toUpperCase()).forEach(System.out::println);
	}

}
