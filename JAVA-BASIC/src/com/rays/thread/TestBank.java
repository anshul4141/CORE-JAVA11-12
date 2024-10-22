package com.rays.thread;

public class TestBank {
	
	public static void main(String[] args) {
		
		AccountHolder a1 = new AccountHolder("Shivkant");
		
		AccountHolder a2 = new AccountHolder("Divyanshu");
		
		
		a1.start();
		a2.start();
		
	}

}
