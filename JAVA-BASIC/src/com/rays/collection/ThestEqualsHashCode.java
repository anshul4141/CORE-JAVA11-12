package com.rays.collection;

public class ThestEqualsHashCode {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Shyam", 14555);
		Employee e2 = new Employee(1, "Ram", 14555);

		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}
