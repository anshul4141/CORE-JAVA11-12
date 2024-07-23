package com.rays.javabasic;

public class SwitchCase {

	public static void main(String[] args) {

		String month = "march";

		switch (month) {
		case "jan":
			System.out.println("this is first month");
			break;
		case "feb":
			System.out.println("this is second month");
			break;
		default:
			System.out.println("month is not available");
			break;
		}

	}

}
