package com.rays.javaoop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Circle c = new Circle();
		Rectangle r = new Rectangle();

		c.setColor("red");
		System.out.println(c.getColor());
		c.setR(5);
		System.out.println(c.getR());
		System.out.println(c.area());

		r.setL(52);
		r.setB(45);
		System.out.println(r.area());

	}

}
