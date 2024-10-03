package com.rays.oop.polymorphism;

public class TestShapeReturnType {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);
		s[2] = Shape.getShape(3);

		Circle c = (Circle) s[0];
		c.setRadius(1);

		Triangle t = (Triangle) s[1];
		t.setHight(5);
		t.setBase(5);

		Rectangle r = (Rectangle) s[2];
		r.setLenght(5);
		r.setBreath(10);

		for (int i = 0; i < s.length; i++) {

			System.out.println(s[i].area());

		}

	}

}
