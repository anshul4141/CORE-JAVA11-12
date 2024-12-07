package com.rays.oop.polymorphism;

public class Rectangle extends Shape {

	private int lenght;
	private int width;

	public Rectangle() {

	}

	public Rectangle(int lenght, int width) {

		this.lenght = lenght;
		this.width = width;

	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public double area() {

		double area = lenght * width;

		return area;
	}

}
