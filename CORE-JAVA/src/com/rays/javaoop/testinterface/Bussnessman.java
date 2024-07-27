package com.rays.javaoop.testinterface;

public class Bussnessman implements Richman {

	@Override
	public void earnMony() {
		System.out.println("Bussnessman Earn Money");

	}

	@Override
	public void donation() {
		System.out.println("Bussnessman giving donation");

	}

	@Override
	public void party() {
		System.out.println("party.........");

	}

}
