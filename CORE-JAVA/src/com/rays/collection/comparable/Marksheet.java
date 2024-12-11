package com.rays.collection.comparable;

public class Marksheet implements Comparable<Marksheet> {

	private String rollNo;
	private String name;
	private int phy;
	private int math;
	private int chm;

	public Marksheet() {
		// TODO Auto-generated constructor stub
	}

	public Marksheet(String r, String n, int p, int m, int c) {

		this.name = n;
		this.rollNo = r;
		this.phy = p;
		this.math = m;
		this.chm = c;

	}

	@Override
	public int compareTo(Marksheet o) {

		// return this.name.compareTo(o.name);

		return this.phy - o.phy;

	}

	@Override
	public String toString() {
		return "rollNo=" + rollNo + ", name=" + name + ", phy=" + phy + ", math=" + math + ", chm=" + chm + "";
	}

}
