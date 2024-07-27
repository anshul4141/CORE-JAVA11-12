package com.rays.javaoop.testinterface;

public class TestInterface {

	public static void main(String[] args) {

		Richman student = new Student();
		Richman businessman = new Bussnessman();

		student.earnMony();
		businessman.earnMony();

	}

}
