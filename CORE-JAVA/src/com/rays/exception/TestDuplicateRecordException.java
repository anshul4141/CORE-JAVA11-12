package com.rays.exception;

public class TestDuplicateRecordException {

	public static void main(String[] args) throws DuplicateRecordException {

		String oldUserId = "abc123";
		String newUserId = "abc123";

		if (newUserId == oldUserId) {

			throw new DuplicateRecordException();

		} else {
			System.out.println("user added successfully");
		}

	}

}
