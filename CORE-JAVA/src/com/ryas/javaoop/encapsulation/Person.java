package com.ryas.javaoop.encapsulation;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String address;

	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
