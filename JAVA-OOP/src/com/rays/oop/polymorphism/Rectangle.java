package com.rays.oop.polymorphism;

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

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	@Override
	public double area() {

		double area = lenght * breath;

		return area;

	}

}
