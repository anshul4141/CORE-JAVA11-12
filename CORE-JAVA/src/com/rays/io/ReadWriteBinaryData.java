package com.rays.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteBinaryData {

	public static void main(String[] args) throws Exception {

		String source = "D:/Movie/AMRAM-2024.mkv";
		String target = "D:/Movie/AMRAM-2025.mkv";

		FileInputStream fr = new FileInputStream(source);
		FileOutputStream fw = new FileOutputStream(target);

		BufferedInputStream br = new BufferedInputStream(fr);
		BufferedOutputStream bw = new BufferedOutputStream(fw);

		int i = br.read();

		while (i != -1) {

			System.out.println(i);

			bw.write(i);

			i = fr.read();

		}

		System.out.println("copy successfully...");
		fr.close();
		fw.close();

	}

}
