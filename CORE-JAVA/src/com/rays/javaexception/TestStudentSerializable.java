package com.rays.javaexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentSerializable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		StudentSerializable s = new StudentSerializable(1, "Anshul");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://Student.dat"));

		out.writeObject(s);

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://student.dat"));

		s = (StudentSerializable) in.readObject();

		System.out.println(s);

	}

}
