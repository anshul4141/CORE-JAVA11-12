package com.rays.oop.methodOverriding;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Circle(4);
		System.out.println("circle area = " + s.area());

		Shape s1 = new Triangle(5, 10);
		System.out.println("triangle area = " + s1.area());

		Shape s2 = new Rectangle(5, 5);
		System.out.println("rectangle are = " + s2.area());

	}

}
