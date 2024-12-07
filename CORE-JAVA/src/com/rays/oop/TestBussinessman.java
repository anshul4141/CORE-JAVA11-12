package com.rays.oop;

public class TestBussinessman {

	public static void main(String[] args) {

		Richman r = new Bussinessman();

		SocialWorker s = new Bussinessman();

		r.donation();
		r.earnMoney();
		r.party();

		s.helpToOthers();

		Bussinessman b = new Bussinessman();

		b.donation();
		b.earnMoney();
		b.party();
		b.helpToOthers();

	}

}
