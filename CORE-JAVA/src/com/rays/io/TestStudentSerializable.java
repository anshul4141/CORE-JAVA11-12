package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentSerializable {

	public static void main(String[] args) throws Exception {

		Student s = new Student(1, "Rays");

		// Serialization
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:/IO/student.txt"));

		out.writeObject(s);

		out.close();

		// Deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/IO/student.txt"));

		s = (Student) in.readObject();

		System.out.println(s);

		in.close();
	}

}
