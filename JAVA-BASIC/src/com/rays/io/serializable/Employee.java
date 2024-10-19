package com.rays.io.serializable;

import java.io.Serializable;

public class Employee implements Serializable {

	private transient int id;
	private String name;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + "";
	}

}
