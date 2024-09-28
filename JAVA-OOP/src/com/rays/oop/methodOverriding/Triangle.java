package com.rays.oop.methodOverriding;

public class Triangle extends Shape {

	private int base;
	private int hight;

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(int base, int hight) {
		this.base = base;
		this.hight = hight;
	}

	@Override
	public double area() {

		double area = (hight * base) / 2;

		return area;
	}

}
