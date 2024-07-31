package com.rays.javaexception;

public class LoginException extends Exception {

	public LoginException() {
		System.out.println("invalid loginId or password");
	}

}
