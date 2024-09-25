package com.rays.oop.encapsulation;

import java.util.Date;

public class TestPerson {

	public static void main(String[] args) {

		Date d = new Date(2002, 02, 02);

		Person p = new Person();

		p.setName("Ram");
		System.out.println(p.getName());
		p.setAddress("Indore");
		System.out.println(p.getAddress());
		p.setDob(d);
		System.out.println(p.getDob());
	}

}
