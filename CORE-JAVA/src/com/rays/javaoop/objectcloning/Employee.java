package com.rays.javaoop.objectcloning;

//Shallow cloning
public class Employee implements Cloneable {

	private String name;
	private String address;

	public Employee() {

	}

	public Employee(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "name=" + name + ", address=" + address + "";
	}

}
