package com.rays.javacollection.comparable;

public class Student implements Comparable<Student> {

	private int id;
	private String name;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id) {
		this.name = name;
		this.id = id;

	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		 return this.id - o.id;

		//return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
