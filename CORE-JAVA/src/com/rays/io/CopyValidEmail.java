package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyValidEmail {

	public static void main(String[] args) throws Exception {

		BufferedWriter bw = new BufferedWriter(new FileWriter("D:/IO/NewEmail.txt"));
		BufferedReader br = new BufferedReader(new FileReader("D:/IO/OldEmail.txt"));

		String email;

		while ((email = br.readLine()) != null) {

			if (email.endsWith("@gmail.com")) {

				System.out.println(email);
				bw.write(email);
				bw.newLine();

			}

		}

		bw.close();
		br.close();

	}

}
