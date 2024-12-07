package com.rays.oop.polymorphism;

public class TestShapByArray {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle(2);
		s[1] = new Rectangle(2, 2);
		s[2] = new Triangle(2, 2);

		System.out.println("area of circle = " + s[0].area());
		System.out.println("area of rectangle = " + s[1].area());
		System.out.println("area of triangle = " + s[2].area());

		System.out.println("---------------");

		for (Shape a : s) {

			System.out.println(a.area());

		}

	}

}
