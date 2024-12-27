package com.rays.io;

import java.io.FileReader;

public class ReadTextFile {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("D:/IO/Hello.txt");

		int i = fr.read();
		
		char c;
		
		while(i != -1) {
			
			c = (char) i;
			
			System.out.print(c);
			
			i = fr.read();
			
		}
		
		fr.close();

	}

}
