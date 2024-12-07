package com.rays.oop.polymorphism;

public class TestShapeByReturnType {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);
		s[2] = Shape.getShape(4);

		System.out.println(s[0].area() + " " + s[1].area() + " " + s[2].area());

	}

}
