package com.rays.java8;

@FunctionalInterface
public interface FunctionalInt {

	public int sum(int i, int j);

	// call by obj
	public default void m1() {
		System.out.println("this is default method");
	}

	// call by name
	public static void m2() {
		System.out.println("this is static method");
	}

}
