package com.rays.oop;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Circle(2);
		Shape s1 = new Rectangle(2, 2);
		

		System.out.println("area of circle = " + s.area());
		System.out.println("area of rectangle = " + s1.area());

	}

}