package com.rays.thread;

public class TestDeamonThread {

	public static void main(String[] args) {

		DeamonThread t = new DeamonThread("Ram...");

		t.setDaemon(true);

		t.start();

		for (int i = 1; i <= 10; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("main");
		}

	}

}
