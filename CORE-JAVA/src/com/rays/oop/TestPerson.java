package com.rays.oop;

import java.util.Date;

public class TestPerson {

	public static void main(String[] args) {

		Person p = new Person();

		p.setName("Ram");

		String name = p.getName();

		System.out.println(name);

		p.setAddress("Idonre");

		String address = p.getAddress();

		System.out.println(address);

		p.setDob(new Date());

		Date dob = p.getDob();

		System.out.println(dob);

	}

}
