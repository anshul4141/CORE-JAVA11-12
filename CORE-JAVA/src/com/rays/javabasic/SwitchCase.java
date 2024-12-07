package com.rays.javabasic;

public class SwitchCase {

	public static void main(String[] args) {

		String month = "apr";

		switch (month) {
		case "jan":
			System.out.println("1st month of year");
			break;
		case "feb":
			System.out.println("2nd month");
			break;
		case "mar":
			System.out.println("3rd month");
			break;
		default:
			System.out.println("this is default case");
			break;
		}

	}

}
