package com.rays.io;

import java.io.File;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {

		File file = new File("D:/IO/Hello.txt");

		System.out.println("is file available: " + file.exists());

		if (file.exists()) {

			System.out.println("can write this file: " + file.canWrite());
			System.out.println("can read this file: " + file.canRead());
			System.out.println("file name: " + file.getName());
			System.out.println("path: " + file.getAbsolutePath());
			Date d = new Date(file.lastModified());
			System.out.println("last modified: " + d);
			
		} else {

			System.out.println("file not found");

		}

	}

}
