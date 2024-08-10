package com.rays.javaoop.objectcloning;

public class TestShallowCloning implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee e = new Employee("Ram", "Indore");

		Employee e2 = (Employee) e;

		e2.setName("Shyam");
		e2.setAddress("Bhopal");
		
		System.out.println(e);
		System.out.println(e2);

	}

}
