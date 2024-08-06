package com.rays.javamap;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put("one", 2);
		m.put("two", 12);
		
		System.out.println(m);
		
		System.out.println(m.get("one"));
		
	}

}
