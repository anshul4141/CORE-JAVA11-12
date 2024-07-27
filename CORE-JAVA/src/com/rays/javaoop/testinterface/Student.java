package com.rays.javaoop.testinterface;

public class Student implements Richman {
	

	@Override
	public void earnMony() {

		System.out.println("Student Earn Money");

	}

	@Override
	public void donation() {

		System.out.println("Student giving donation");
	}

	@Override
	public void party() {
		System.out.println("Party............");
	}

}
