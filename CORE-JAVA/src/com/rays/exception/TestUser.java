package com.rays.exception;

public class TestUser {

	public static void main(String[] args) {

		String userId = "abc123";

		if (userId != "abc123") {

			try {
				throw new LoginException("User Not Found");
			} catch (LoginException e) {
				e.printStackTrace();
			}

		} else {

			System.out.println("User Login Successfully");

		}

	}

}
