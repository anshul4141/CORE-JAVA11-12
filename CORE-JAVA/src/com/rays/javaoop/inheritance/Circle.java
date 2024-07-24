package com.rays.javaoop.inheritance;

public class Circle extends Shape {

	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public void area() {
		System.out.println(r * r * 3.14);
	}

}
