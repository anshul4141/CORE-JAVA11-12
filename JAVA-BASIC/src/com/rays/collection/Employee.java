package com.rays.collection;

public class Employee {

	private int id;
	private String name;
	private int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {

		Employee e = (Employee) obj;

		return this.id == e.id && this.name == e.name && this.salary == e.salary;
	}

	@Override
	public int hashCode() {

		String value = this.id + this.name + this.salary;

		return value.hashCode();

	}

}
