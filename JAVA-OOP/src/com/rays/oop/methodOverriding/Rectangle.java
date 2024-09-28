package com.rays.oop.methodOverriding;

public class Rectangle extends Shape {

	private int lenght;
	private int breath;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int lenght, int breath) {
		this.lenght = lenght;
		this.breath = breath;
	}

	@Override
	public double area() {

		double area = lenght * breath;

		return area;

	}

}
