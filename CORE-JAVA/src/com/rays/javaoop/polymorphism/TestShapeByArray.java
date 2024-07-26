package com.rays.javaoop.polymorphism;

public class TestShapeByArray {

	public static void main(String[] args) {

		Shape[] s = new Shape[2];

		s[0] = new Circle(6);
		s[1] = new Rectangle(5, 6);

		for (int i = 0; i < s.length; i++) {

			System.out.println(s[i].area());

		}

	}

}
