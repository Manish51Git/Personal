package com.ty.string;

public class MultithreadingDemo extends Thread {

	@Override
	public void run() {
		try {
			System.out.println(
					"Thread " + Thread.currentThread().getId() + " is Running " + Thread.currentThread().getName());

		} catch (Exception e) {
			System.out.println("exception is caught");
		}

	}

	public static void main(String[] args) {

		for (int i = 0; i <= 8; i++) {
			MultithreadingDemo object = new MultithreadingDemo();
			object.start();

			

		}

	}

}
