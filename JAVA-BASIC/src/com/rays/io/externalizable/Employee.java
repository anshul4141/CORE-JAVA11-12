package com.rays.io.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

	private transient int id;
	private String name;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeInt(id);
		out.writeObject(name);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		id = in.readInt();
		name = (String) in.readObject();
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + "";
	}

}
