package com.rays.collection.streamapi;

public class Contestant {

	 String name;
	 String phoneNo;

	public Contestant(String name, String phoneNo) {

		this.name = name;
		this.phoneNo = phoneNo;

	}

	public String getName() {
		return name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	@Override
	public String toString() {

		return "name = " + name + " phoneNo = " + phoneNo;
	}

}
