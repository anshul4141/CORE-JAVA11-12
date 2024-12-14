package com.rays.collection;

public class TestStudentEqualsHashCode {

	public static void main(String[] args) {

		Student s1 = new Student(5, "Ram", "Indore");
		Student s2 = new Student(5, "Ram", "Indore");
		// Employee e = new Employee("ram", "indore");

		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
