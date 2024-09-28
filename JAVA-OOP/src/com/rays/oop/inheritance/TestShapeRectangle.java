package com.rays.oop.inheritance;

public class TestShapeRectangle {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();

		r.setColor("Yellow");
		r.setBorderWidth(6);
		r.setLenght(4);
		r.setBreath(4);

		System.out.println("color = " + r.getColor());
		System.out.println("borderwidth = " + r.getBorderWidth());
		System.out.println("lenght = " + r.getLenght());
		System.out.println("breath = " + r.getBreath());

		System.out.println("area = " + r.area());

	}

}
