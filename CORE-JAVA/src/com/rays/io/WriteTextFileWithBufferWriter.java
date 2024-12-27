package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFileWithBufferWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("D:/IO/Rays.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		char[] charArry = { 'h', 'i' };

		bw.write(charArry);
		bw.write(',');
		bw.write("SunRays");

		System.out.println("successfully....");

		bw.close();

	}

}
