package com.rays.javabasic;

public class Login {

	public static void main(String[] args) {

		String email = "abc12@gmail.com";
		String pwd = "abc123";

//		if (email != "abc@gmail.com") {
//
//			System.out.println("email id is invalid");
//
//		} else {
//			System.out.println("login successfullyy");
//		}

		if (email != "abc@gmail.com") {

			System.out.println("email is invalid");

		} else if (pwd != "abc123") {

			System.out.println("pwd is invalid");

		} else {

			System.out.println("login successfully");
		}

	}

}
