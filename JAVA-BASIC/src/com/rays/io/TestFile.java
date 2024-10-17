package com.rays.io;

import java.io.File;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {

		File f = new File("D:\\IO\\Hello.txt");

		if (f.exists()) {

			System.out.println("file name = " + f.getName());
			System.out.println("path of file = " + f.getAbsolutePath());
			System.out.println("can write this file = " + f.canWrite());
			System.out.println("can read this file = " + f.canRead());

			Date d = new Date(f.lastModified());

			System.out.println("file modified date = " + d);

		} else {
			System.out.println("file not exists...");
		}

	}

}
