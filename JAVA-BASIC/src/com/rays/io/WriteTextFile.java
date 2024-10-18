package com.rays.io;

import java.io.FileWriter;

public class WriteTextFile {

	public static void main(String[] args) throws Exception {

		FileWriter fw = new FileWriter("D://IO//Sunilos.txt");

		char[] charArray = { 'h', 'i' };

		fw.write(charArray);
		fw.write(',');
		fw.write("SunilOs");

		System.out.println("data write successfully...");

		fw.close();

	}

}
