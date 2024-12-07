package com.rays.oop;

public class ConstructorCalling {

	public String name;
	public String address;
	public String mobileNo;

	public ConstructorCalling() {

		System.out.println("This Is Default Constructor");

	}

	public ConstructorCalling(String name, String address) {

		this();
		this.name = name;
		this.address = address;
		System.out.println("name = " + this.name);
		System.out.println("address = " + this.address);

	}

	public ConstructorCalling(String name, String address, String mobileNo) {

		this(name, address);
		this.mobileNo = mobileNo;
		System.out.println("mobileNo = " + this.mobileNo);

	}

}
