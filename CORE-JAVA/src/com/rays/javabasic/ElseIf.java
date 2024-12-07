package com.rays.javabasic;

public class ElseIf {

	public static void main(String[] args) {

		String loginId = null;

		if (loginId == null) {

			System.out.println("loginId is required..");

		} else if (loginId != "abc@gmail.com") {

			System.out.println("your loginId is invalid..");

		} else {
			System.out.println("user login successfully");
		}

	}

}
