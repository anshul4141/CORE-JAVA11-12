package com.rays.collection.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestantWinner {

	public static void main(String[] args) {

		List<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("Ram", "8985452365"));
		list.add(new Contestant("Ram", "8985452365"));
		list.add(new Contestant("Pawan", "7858965858"));
		list.add(new Contestant("Uday", "7856985425"));
		list.add(new Contestant("Anish", "8526598758"));
		list.add(new Contestant("Kamal", "858785"));

		// get the phoneNo.
		list.stream().map(e -> e.getPhoneNo()).forEach(System.out::println);

		System.out.println("----get valid phoneNo----");

		// get the valid phoneNo.
		list.stream().map(e -> e.getPhoneNo()).filter(e -> e.length() == 10).forEach(System.out::println);

		System.out.println("----remove duplicate phoneNo----");

		// remove duplicate phoneNo.
		list.stream().map(e -> e.getPhoneNo()).distinct().filter(e -> e.length() == 10).forEach(System.out::println);
		System.out.println("-----------------");

		// shuffle phoneNo.
		list.stream().map(e -> e.getPhoneNo()).distinct().filter(e -> e.length() == 10)
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(System.out::println);

	}

}
