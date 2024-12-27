package com.rays.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

	transient int id;
	String name;

	public Employee() {

	}

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;

	}


	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(name);
		out.writeInt(id);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		name = (String) in.readObject();
		//id = in.readInt();

	}

	@Override
	public String toString() {
		return "name= " + name + ", id= " + id + "";
	}

}
