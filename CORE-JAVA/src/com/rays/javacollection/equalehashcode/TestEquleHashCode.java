package com.rays.javacollection.equalehashcode;

public class TestEquleHashCode {

	public static void main(String[] args) {

		Student s1 = new Student(1, 100, "Ram");
		Student s2 = new Student(2, 100, "Ram");

		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
