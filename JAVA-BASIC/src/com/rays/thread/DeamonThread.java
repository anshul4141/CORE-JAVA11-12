package com.rays.thread;

public class DeamonThread extends Thread {

	public String name;

	public DeamonThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		while (true) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}

	}

}
