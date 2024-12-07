package com.rays.oop;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int length, int width) {

		this.length = length;
		this.width = width;

	}

	@Override
	public double area() {

		double area = length * width;

		return area;
	}

}
