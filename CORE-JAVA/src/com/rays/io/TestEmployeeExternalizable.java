package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeExternalizable {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee(1, "rays");

		// Serialization
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:/IO/employee.txt"));

		out.writeObject(e);

		out.close();

		// Deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/IO/employee.txt"));

		e = (Employee) in.readObject();

		System.out.println(e);

		in.close();
	}

}
