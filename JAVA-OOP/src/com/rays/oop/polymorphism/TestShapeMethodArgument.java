package com.rays.oop.polymorphism;

public class TestShapeMethodArgument {

	public static double calArea(Shape[] s) {

		double totalArea = 0.0;

		for (int i = 0; i < s.length; i++) {

			totalArea = totalArea + s[i].area();

		}

		return totalArea;

	}

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		// 3.14
		s[0] = new Circle(1);

		// 25
		s[1] = new Triangle(5, 10);

		// 100
		s[2] = new Rectangle(10, 10);

		double totalArea = calArea(s);

		System.out.println(totalArea);

	}

}
