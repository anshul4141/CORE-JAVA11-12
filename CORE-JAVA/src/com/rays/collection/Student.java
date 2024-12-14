package com.rays.collection;

public class Student {

	public int id;
	public String name;
	public String address;

	public Student(int id, String n, String a) {

		this.id = id;
		this.name = n;
		this.address = a;

	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Student)) {
			return false;
		}

		Student s = (Student) obj;
		return this.id == s.id && this.name == s.name && this.address == s.address;
	}

	@Override
	public int hashCode() {
		String key = this.id + this.name + this.address;
		return key.hashCode();
	}

}
