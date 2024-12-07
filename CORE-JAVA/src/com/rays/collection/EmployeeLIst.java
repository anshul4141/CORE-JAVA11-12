package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeLIst {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("Ram", "Indore"));
		list.add(new Employee("Shyam", "Bhopal"));
		list.add(new Employee("Aaman", "Ujjain"));
		list.add(new Employee("Raman", "Indore"));

		System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
