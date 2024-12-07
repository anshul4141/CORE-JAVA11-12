package com.rays.collection;

public class Employee {

	private String name;
	private String address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String address) {

		this.name = name;
		this.address = address;

	}

	@Override
	public String toString() {
		return "name=" + name + ", address=" + address + "";
	}

}
