package com.rays.oop.dataabstraction;

public class Circle extends Shape {

	private int r;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int r) {
		this.r = r;
	}

	@Override
	public double area() {

		double area = Math.PI * r * r;

		return area;
	}

}
