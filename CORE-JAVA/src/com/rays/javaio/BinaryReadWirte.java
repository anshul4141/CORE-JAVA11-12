package com.rays.javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryReadWirte {

	public static void main(String[] args) throws IOException {

		String source = "D://sunflower.png";

		String target = "D://sunflower1.png";

		FileInputStream in = new FileInputStream(source);

		FileOutputStream out = new FileOutputStream(target);

		int i = in.read();

		while (i != -1) {

			System.out.println(i);

			out.write(i);

			i = in.read();

		}

		out.close();
		System.out.println("sucessfullyy......");

	}

}
