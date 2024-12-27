package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("D:/IO/Sunilos.txt", true);

		char[] charArry = { 'h', 'i' };

		fw.write(charArry);
		fw.write(',');
		fw.write("SunulOs ");

		System.out.println("Sucessfully........");

		fw.close();

	}

}
