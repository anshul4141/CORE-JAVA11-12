package com.rays.oop.polymorphism;

public class Shape {

	public final static double PI = 3.14;

	public double area() {

		return 0.0;

	}

	public static Shape getShape(int i) {

		if (i == 1) {
			return new Circle(2);
		}
		if (i == 2) {
			return new Rectangle(5, 5);
		}
		if (i == 3) {
			return new Triangle(5, 5);
		}

		return new Shape();

	}

}
