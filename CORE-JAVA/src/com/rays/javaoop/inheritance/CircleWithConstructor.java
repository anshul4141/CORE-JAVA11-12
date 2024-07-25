package com.rays.javaoop.inheritance;

public class CircleWithConstructor extends Shape {

	private int r;

	public CircleWithConstructor() {

	}

	public CircleWithConstructor(int r) {

		this.r = r;

	}

	public int getR() {
		return this.r;
	}

	@Override
	public double area() {
		double area = r * r * 3.14;
		return area;
	}

}
