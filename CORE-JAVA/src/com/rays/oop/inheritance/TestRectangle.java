package com.rays.oop.inheritance;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();

		r.setColor("blue");
		r.setBorderWidth(10);
		r.setLenght(5);
		r.setWidth(5);

		System.out.println("color = " + r.getColor());
		System.out.println("borderwidth = " + r.getBorderWidth());
		System.out.println("lenght = " + r.getLenght());
		System.out.println("width = " + r.getWidth());
		System.out.println("area = " + r.area());

	}

}
