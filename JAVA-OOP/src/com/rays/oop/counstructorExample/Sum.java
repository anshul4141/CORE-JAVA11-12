package com.rays.oop.counstructorExample;

// constructor overlodin diffrent param and diffrent data types
public class Sum {

	// defalut Constructor
	public Sum() {
		System.out.println("this is default counstructor");
	}

	// two param Constructor
	public Sum(int i, int b) {

		System.out.println("sum of two no = " + (i + b));

	}

	// three param Constructor
	public Sum(int i, int b, int c) {

		System.out.println("sum of three no = " + (i + b + c));

	}

}
