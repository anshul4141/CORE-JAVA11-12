package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map m = new HashMap();

		m.put(1, "one");
		m.put(2, "two");

		System.out.println("map = " + m);
		
		System.out.println(m.get(2));
		
		System.out.println(m.containsKey(1));

	}

}
