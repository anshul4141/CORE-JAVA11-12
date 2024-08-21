package com.rays.javaio;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {

		FileWriter f = new FileWriter("D://HelloWorld.txt", true);

		f.write("\n" + "Hello world");

		f.close();

		System.out.println("successfully");

	}

}
