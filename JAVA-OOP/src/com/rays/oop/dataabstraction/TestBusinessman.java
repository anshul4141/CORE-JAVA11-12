package com.rays.oop.dataabstraction;

public class TestBusinessman {

	public static void main(String[] args) {

		Ambani a = new Ambani();

		a.donation();
		a.party();
		a.earnMoney();

		RatanTata r = new RatanTata();

		r.donation();
		r.party();
		r.earnMoney();
		r.helpToOther();

	}

}
