package com.rays.collection;

public class Student {

	public int id;
	public String name;

	public Student(int id, String n) {

		this.id = id;
		this.name = n;

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

		return this.id == s.id && this.name == s.name;
	}
	
	@Override
	public int hashCode() {
		
		String key = this.id + this.name;
		
		return key.hashCode();
	
	}

}
