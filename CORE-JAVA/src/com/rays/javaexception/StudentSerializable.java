package com.rays.javaexception;

import java.io.Serializable;

public class StudentSerializable implements Serializable {

	transient int id;
	String name;

	public StudentSerializable() {
		// TODO Auto-generated constructor stub
	}

	public StudentSerializable(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {

		return ("id: " + id + " name: " + name + "");
	}

}
