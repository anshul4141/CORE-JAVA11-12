package com.rays.thread;

public class WithThread extends Thread {

	public String name;

	public WithThread(String name) {

		this.name = name;

	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(i + " = " + name);

		}

	}

}
