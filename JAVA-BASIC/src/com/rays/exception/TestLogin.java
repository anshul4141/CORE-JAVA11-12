package com.rays.exception;

public class TestLogin {

	public static void main(String[] args) {

		String login = "abc";

		if (login != "abc") {

			try {
				throw new LoginException("invalid login id or password..");
			} catch (LoginException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("login successfully");
		}

	}

}
