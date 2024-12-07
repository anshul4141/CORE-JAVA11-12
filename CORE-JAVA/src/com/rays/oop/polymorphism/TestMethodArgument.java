package com.rays.oop.polymorphism;

public class TestMethodArgument {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle(2);
		s[1] = new Rectangle(2, 2);
		s[2] = new Triangle(5, 5);

		System.out.println("total area = " + calculateArea(s));

	}

	public static double calculateArea(Shape[] s) {

		double totalArea = 0.0;

		for (int i = 0; i < s.length; i++) {

			System.out.println("area = " + s[i].area());

			totalArea = totalArea + s[i].area();

		}

		return totalArea;

	}

}
