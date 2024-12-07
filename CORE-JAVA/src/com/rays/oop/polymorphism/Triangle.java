package com.rays.oop.polymorphism;

public class Triangle extends Shape {

	private int base;
	private int hight;

	public Triangle() {

	}

	public Triangle(int b, int h) {

		this.base = b;
		this.hight = h;

	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	@Override
	public double area() {

		double area = base * hight / 2;

		return area;
	}

}
