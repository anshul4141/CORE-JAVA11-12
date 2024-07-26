package com.rays.javaoop.polymorphism;

public class TestShapeSimple {

	public static void main(String[] args) {

		Shape s1 = new Circle(5);
		Shape s2 = new Rectangle(5, 4);

		System.out.println(s1.area());
		System.out.println(s2.area());

	}

}
