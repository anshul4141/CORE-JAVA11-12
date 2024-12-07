package com.rays.oop;

public class Circle extends Shape {

	private int radius;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {

		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	@Override
	public double area() {

		double area = 3.14 * radius * radius;

		return area;
	}

}
