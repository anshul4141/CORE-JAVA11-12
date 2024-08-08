package com.rays.javacollection.comparator;

import java.util.Comparator;

public class SortByNameOrRollNo implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		if (o1.getName().equals(o2.getName())) {

			return o1.getRollNo() - o2.getRollNo();
		} else {

			return o1.getName().compareTo(o2.getName());

		}

	}

}
