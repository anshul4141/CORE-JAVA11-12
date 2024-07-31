package com.rays.javaexception;

public class Authentication {

	public static void main(String[] args) throws LoginException {

		String login = "admi";

		if (login == null || login != "admin") {

			LoginException e = new LoginException();

			throw e;

		} else {
			System.out.println("login successfully");
		}

	}

}
