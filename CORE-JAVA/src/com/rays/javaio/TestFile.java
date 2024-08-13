package com.rays.javaio;

import java.io.File;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {

		File f = new File("D:\\FirstTest123.txt");

		System.out.println("File is available..");
		System.out.println("File Name = " + f.getName());
		System.out.println("File path = " + f.getAbsolutePath());
		// System.out.println("last modifid = " + new Date(f.lastModified()));
		System.out.println("can read and write this file " + f.canRead() + " " + f.canWrite());

	}

}
