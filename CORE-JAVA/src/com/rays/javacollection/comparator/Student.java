package com.rays.javacollection.comparator;

public class Student {

	private String name;
	private int id;
	private int rollNo;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id, int rollNo) {
		this.name = name;
		this.id = id;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getRollNo() {
		return rollNo;
	}

	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", rollNo=" + rollNo + "";
	}

}
