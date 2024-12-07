package com.rays.oop.polymorphism;

public class TestShapeByGetterSetter {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();

		Circle c = (Circle) s[0];
		c.setR(2);
		System.out.println("radius = " + c.getR());
		System.out.println("area of circle = " + s[0].area());

		Rectangle r = (Rectangle) s[1];
		r.setLenght(5);
		r.setWidth(5);
		System.out.println("lenght = " + r.getLenght() + " " + "width = " + r.getWidth());
		System.out.println("area of rectangle = " + s[1].area());
		
		
	}

}
