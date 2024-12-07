package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {

		Map m = new HashMap();

		m.put("one", 1);
		m.put("two", 2);
		m.put("three", "Three");

		System.out.println(m.get("one"));
		System.out.println(m.get("three"));
		System.out.println(m.get("two"));

	}

}
