package com.rays.javaoop.objectcloning;

public class TestDeepCloning implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student s = new Student("Rays", new Address("Indore"));

		Student s2 = (Student) s.clone();
		s2.setCity(new Address("Bhopal"));
		s2.setName("NCS");

		System.out.println(s);
		System.out.println(s2);

	}

}
