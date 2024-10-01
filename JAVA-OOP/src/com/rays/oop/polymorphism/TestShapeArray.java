package com.rays.oop.polymorphism;

public class TestShapeArray {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle();
		s[1] = new Triangle();
		s[2] = new Rectangle();

		// type casting

		Circle c = (Circle) s[0];
		c.setRadius(1);

		Triangle t = (Triangle) s[1];
		t.setBase(5);
		t.setHight(10);

		Rectangle r = (Rectangle) s[2];
		r.setBreath(10);
		r.setLenght(10);

		System.out.println(s[0].area());
		System.out.println(s[1].area());
		System.out.println(s[2].area());
	}

}
