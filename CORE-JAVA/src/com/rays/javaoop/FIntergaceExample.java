package com.rays.javaoop;

@FunctionalInterface
public interface FIntergaceExample {

	public int sum(int a, int b);

	public static void m1() {
		System.out.println("this is static method");
	}

	public default void m2() {
		System.out.println("this is default method");
	}

}
