package com.rays.javaoop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Circle c = new Circle();

		c.setColor("red");
		System.out.println(c.getColor());
		c.setR(5);
		System.out.println(c.getR());
		c.area();

	}

}
