package com.rays.io;

import java.io.FileReader;

public class ReadTextFile {

	public static void main(String[] args) throws Exception {

		FileReader r = new FileReader("D:\\IO\\Hello.txt");

		int i = r.read();

		char ch;

		while (i != -1) {

			ch = (char) i;

			System.out.print(ch);

			i = r.read();

		}

		r.close();

	}

}
