package com.rays.oop;

public class TestSuperConstructor extends ConstructorCalling {

	public TestSuperConstructor() {

		super();

	}

	public TestSuperConstructor(String name, String address, String mobileNo) {

		super(name, address, mobileNo);

	}

	public static void main(String[] args) {

		TestSuperConstructor t = new TestSuperConstructor("Ram", "Indore", "8985856985");

	}

}
