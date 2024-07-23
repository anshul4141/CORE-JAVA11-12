package com.ryas.javaoop.encapsulation;

public class TestPerson {

	public static void main(String[] args) {

		Person p1 = new Person();

		p1.setFirstName("Azam");
		System.out.println(p1.getFirstName());
		p1.setLastName("Khan");
		System.out.println(p1.getLastName());
		p1.setAge(20);
		System.out.println(p1.getAge());
		p1.setAddress("indore");
		System.out.println(p1.getAddress());

	}

}
