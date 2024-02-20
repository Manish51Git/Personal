package com.ty.multithreading;

public class JoinDemo extends Thread {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();

		for (int i = 1; i <= 3; i++) {
			System.out.println(name);
		}

	}

	public static void main(String[] args) {

		JoinDemo t1 = new JoinDemo();
		JoinDemo t2 = new JoinDemo();
		JoinDemo t3 = new JoinDemo();

		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		
		t3.suspend();
		t3.resume();

		String name = Thread.currentThread().getName();

		for (int i = 1; i <= 3; i++) {
			System.out.println(name);
		}

	}

}
