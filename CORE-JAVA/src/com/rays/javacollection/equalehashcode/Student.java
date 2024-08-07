package com.rays.javacollection.equalehashcode;

public class Student {

	private Integer id;
	private Integer marks;
	private String name;

	public Student() {

	}

	public Student(Integer id, Integer marks, String name) {

		this.id = id;
		this.marks = marks;
		this.name = name;

	}

	@Override
	public boolean equals(Object obj) {
		
		Student s = (Student) obj;

		return name.equals(s.name) && id.equals(s.id) && marks.equals(s.marks);

	}

	@Override
	public int hashCode() {

		String value = id + marks + name;

		return value.hashCode();

	}

	@Override
	public String toString() {
		return "id=" + id + ", marks=" + marks + ", name=" + name + "";
	}

}
