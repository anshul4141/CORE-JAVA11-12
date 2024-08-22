package com.rays.thread;

public class TestByDeamon {

	public static void main(String[] args) {

		DeamonThread d = new DeamonThread("normal thread = Ram");

		d.setDaemon(true);

		d.start();

		System.out.println(d.isDaemon());

		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("main thread");

		}

	}

}
