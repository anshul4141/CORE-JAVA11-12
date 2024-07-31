package com.rays.javaexception;

public class TryCatchFinally {

	public static void main(String[] args) {

		String str = null;
		String[] str1 = { "a", "b", "c" };

		try {
			System.exit(0);

			System.out.println(str.length());
			System.out.println(str1[2]);
			

		} catch (NullPointerException e) {

			System.out.println("Exception = " + e.getMessage());
			
			//System.exit(0);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Exception = " + e.getMessage());

			//System.exit(0);

		} finally {
			System.out.println("this is finally block");
		}

	}

}
