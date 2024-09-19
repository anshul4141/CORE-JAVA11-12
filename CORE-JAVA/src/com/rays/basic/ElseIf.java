package com.rays.basic;

public class ElseIf {

	public static void main(String[] args) {

		String loginId = "abc";
		String pwd = "1234";

		if (loginId == null && pwd == null) {

			System.out.println("loginId or password is null");

		} else if (loginId != "abc") {

			System.out.println("loginId is incurrect");

		} else if (pwd != "123") {

			System.out.println("password is incurrect");

		} else {
			System.out.println("user login successfully");
		}

	}

}
