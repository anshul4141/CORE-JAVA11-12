package com.rays.javaoop.inheritance;

public class Rectangle extends Shape {

	private int l;
	private int b;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public double area() {
		double area = l * b;
		return area;
	}

}
