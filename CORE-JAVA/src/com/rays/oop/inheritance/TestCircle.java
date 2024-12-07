package com.rays.oop.inheritance;

public class TestCircle {

	public static void main(String[] args) {

		Circle c = new Circle();

		c.setColor("red");
		c.setBorderWidth(5);
		c.setRadius(2);

		System.out.println("color = " + c.getColor());
		System.out.println("BorderWidth = " + c.getBorderWidth());
		System.out.println("radius = " + c.getRadius());
		System.out.println("area = " + c.area());

	}

}
