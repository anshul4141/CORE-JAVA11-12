package com.rays.javaoop.objectcloning;

public class Student implements Cloneable {

	private String name;
	private Address city;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, Address city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getCity() {
		return city;
	}

	public void setCity(Address city) {
		this.city = city;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Student s = (Student) super.clone();

		s.city = (Address) city.clone();

		return s;

	}

	@Override
	public String toString() {
		return "name=" + name + ", city=" + city + "]";
	}

}
