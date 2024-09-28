package com.rays.oop.methodOverriding;

public class Circle extends Shape {

	private int radius;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {

		this.radius = radius;

	}

	@Override
	public double area() {

		double area = Math.PI * radius * radius;

		return area;

	}

}
