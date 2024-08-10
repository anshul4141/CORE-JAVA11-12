package com.rays.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ContenstantWinner {

	public static void main(String[] args) {

		List<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("Aryan", "9865825487"));
		list.add(new Contestant("Aditya", "8785965898"));
		list.add(new Contestant("Vinjal", "8785965248"));
		list.add(new Contestant("Priya", "7856985875"));
		list.add(new Contestant("Madhumita", "6589857548"));
		list.add(new Contestant("Suraj", "8532545879"));
		list.add(new Contestant("Binod", "659857"));
		list.add(new Contestant("asdfghjklo", "8532545879"));

		// get contestant
		list.stream().map(e -> e.getName() + " " + e.getPhonNo()).forEach(e -> System.out.println(e));
		System.out.println("-----------------");
		// remove duplicate contestant
		list.stream().map(e -> e.getName() + " " + e.getPhonNo()).distinct().forEach(e -> System.out.println(e));
		System.out.println("-----------------");
		// sorted contestant
		list.stream().map(e -> e.getName() + " " + e.getPhonNo()).distinct().sorted()
				.forEach(e -> System.out.println(e));

		System.out.println("-----------------");

		// remove invalid phoneNo
		list.stream().map(e -> e.getPhonNo()).filter(e -> e.length() == 10).forEach(e -> System.out.println(e));

		System.out.println("-----------------");

		// contestant shuffle
		list.stream().map(e -> e.getName() + " " + e.getPhonNo()).distinct().sorted()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {

					Collections.shuffle(e);
					return e.stream();
				})).limit(2).forEach(e -> System.out.println(e));

	}

}
