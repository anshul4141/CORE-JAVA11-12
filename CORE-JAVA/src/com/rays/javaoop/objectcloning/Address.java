package com.rays.javaoop.objectcloning;

public class Address implements Cloneable {

	private String city;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city) {

		this.city = city;

	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "city=" + city + "";
	}

}
