package com.rays.collection.streamapi;

import java.util.ArrayList;
import java.util.List;

public class FindOddNo {

	public static boolean findOdd(int i) {

		if (i % 2 == 0 || i == 1) {

			return false;

		} else {

			return true;

		}

	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
	
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(3);
		list.add(4);

		list.stream().filter(e -> findOdd(e)).forEach(System.out::println);

	}

}
