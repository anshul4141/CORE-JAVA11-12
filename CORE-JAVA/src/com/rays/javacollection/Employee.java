package com.rays.javacollection;

public class Employee {

	private int id;
	private String name;
	private String salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
