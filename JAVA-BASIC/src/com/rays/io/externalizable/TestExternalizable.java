package com.rays.io.externalizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalizable {

	public static void main(String[] args) throws Exception, IOException {

		Employee e = new Employee(1, "Ram");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//Ram.txt"));

		out.writeObject(e);

		out.close();

		System.out.println("Success...");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//Ram.txt"));

		e = (Employee) in.readObject();

		System.out.println(e);

	}

}
