package com.rays.javaoop.polymorphism;

public class Circle extends Shape {

	private int r;

	public Circle() {

	}

	public Circle(int r) {

		this.r = r;

	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public double area() {

		double area = r * r * PI;

		return area;

	}

}