package com.rays.thread;

public class TestHelloDeamon {

	public static void main(String[] args) {

		HelloDeamon t = new HelloDeamon("DeamonThread...");

		//t.setDaemon(true);

		t.start();

		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("main");
		}

	}

}
