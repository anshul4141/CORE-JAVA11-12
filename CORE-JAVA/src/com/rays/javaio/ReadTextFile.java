package com.rays.javaio;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {

		FileReader f = new FileReader("D:\\FirstTest.txt");

		int i = f.read();

		char ch;

		while (i != -1) {

			System.out.print(ch = (char) i);

			i = f.read();

		}

	}

}
