package com.rays.exception;

public class UnCheckedException {

	public static void main(String[] args) {

		try {
			dad();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void dad() {

		mom();

	}

	public static void mom() {

		son();

	}

	public static void son() {

		throw new RuntimeException("make mistack");

	}

}
