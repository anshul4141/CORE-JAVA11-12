package com.rays.collection;

public class CheckBinaryData {

	public static void main(String[] args) {
		// Example inputs for different data types
		int intValue = 123;
		char charValue = 'A';
		boolean booleanValue = true;
		double doubleValue = 12.34; // We'll use `Double.doubleToRawLongBits` for binary

		// Display binary representations
		System.out.println("Binary of int (" + intValue + "): " + Integer.toBinaryString(intValue));
		System.out.println("Binary of char ('" + charValue + "'): "
				+ String.format("%16s", Integer.toBinaryString(charValue)).replace(' ', '0'));
		System.out.println("Binary of boolean (" + booleanValue + "): " + (booleanValue ? "1" : "0"));
		System.out.println("Binary of double (" + doubleValue + "): "
				+ Long.toBinaryString(Double.doubleToRawLongBits(doubleValue)));
	}

}
