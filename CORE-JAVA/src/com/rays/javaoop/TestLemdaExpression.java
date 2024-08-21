package com.rays.javaoop;

public class TestLemdaExpression {

	public static void main(String[] args) {

		FIntergaceExample e = (a, b) -> {
			return a + b;
		};
		
		  System.out.println(e.sum(5, 10));
		  
		  e.m2();
		  FIntergaceExample.m1();

	}

}
