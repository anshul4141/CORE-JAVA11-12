package com.rays.thread;

public class ByRnnable implements Runnable {

	public String name;

	public ByRnnable() {
		// TODO Auto-generated constructor stub
	}

	public ByRnnable(String name) {

		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

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
