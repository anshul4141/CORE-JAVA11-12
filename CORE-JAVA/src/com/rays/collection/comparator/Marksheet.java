package com.rays.collection.comparator;

public class Marksheet {

	public String rollNo;
	public String name;
	public int phy;
	public int math;
	public int chm;

	public Marksheet(String r, String n, int p, int m, int c) {

		this.name = n;
		this.rollNo = r;
		this.phy = p;
		this.math = m;
		this.chm = c;

	}

	@Override
	public String toString() {
		
		return "rollNo=" + rollNo + ", name=" + name + ", phy=" + phy + ", math=" + math + ", chm=" + chm + "";
	
	}

}
