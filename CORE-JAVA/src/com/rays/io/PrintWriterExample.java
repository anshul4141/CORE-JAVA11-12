package com.rays.io;

import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws Exception {

		// Specify the file to write to
		PrintWriter pw = new PrintWriter("D:/IO/Example.txt");

		// Write data to the file
		pw.println("Welcome to Java Programming!");
		pw.println("This is an example of PrintWriter.");
		pw.println("It allows writing formatted text to files easily.");

		// close the PrintWriter
		pw.close();

		System.out.println("Data written successfully to the file.");
	}
}
