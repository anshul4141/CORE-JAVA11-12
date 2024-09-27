package com.rays.oop.inheritance;

public class TestShapeTriangle {

	public static void main(String[] args) {

		Triangle t = new Triangle();

		t.setColor("Blue");
		t.setBorderWidth(6);
		t.setHight(5);
		t.setBase(10);

		System.out.println("color = " + t.getColor());
		System.out.println("borderwidth = " + t.getBorderWidth());
		System.out.println("hight = " + t.getHight());
		System.out.println("base = " + t.getBase());
		System.out.println("area = " + t.area());

	}

}
