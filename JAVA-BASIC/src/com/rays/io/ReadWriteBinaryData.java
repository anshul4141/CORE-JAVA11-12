package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteBinaryData {

	public static void main(String[] args) throws Exception {

		String source = "D://IO//rayslogo.png";

		String target = "D://IO//rayslogo2.png";

		FileInputStream in = new FileInputStream(source);

		FileOutputStream out = new FileOutputStream(target);

		int i = in.read();

		while (i != -1) {
			
			System.out.println(i);

			out.write(i);

			i = in.read();

		}

		System.out.println("image write successfully..");

		in.close();
		out.close();

	}

}
