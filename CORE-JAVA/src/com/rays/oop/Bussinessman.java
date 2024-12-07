package com.rays.oop;

public class Bussinessman extends Person implements Richman, SocialWorker {

	@Override
	public void helpToOthers() {

		System.out.println("Help To Others");

	}

	@Override
	public void earnMoney() {

		System.out.println("earn Mondy");

	}

	@Override
	public void donation() {

		System.out.println("give donation");

	}

	@Override
	public void party() {

		System.out.println("party....");

	}

}
