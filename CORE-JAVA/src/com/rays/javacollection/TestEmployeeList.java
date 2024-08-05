package com.rays.javacollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployeeList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(1, "Ram", "5000"));
		list.add(new Employee(2, "Syam", "60000"));

		System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Employee e = (Employee) it.next();

			System.out.println(e);

		}

	}

}
