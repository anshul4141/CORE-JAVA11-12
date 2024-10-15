package com.rays.comporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(5, "Ram", 45000));
		list.add(new Employee(3, "Shyam", 35000));
		list.add(new Employee(2, "Aman", 75000));
		list.add(new Employee(1, "Baman", 25000));
		list.add(new Employee(4, "Kamlesh", 15000));

		CompareById cid = new CompareById();

		Collections.sort(list, cid);
		System.out.println("-----compare by id------");

		list.forEach(System.out::println);

		CompareByName cname = new CompareByName();

		Collections.sort(list, cname);
		System.out.println("-----compare by name------");

		list.forEach(System.out::println);

	}

}
