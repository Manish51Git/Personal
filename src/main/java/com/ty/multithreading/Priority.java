package com.ty.multithreading;

public class Priority extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "  Priority: " + Thread.currentThread().getPriority());
		System.out.println();
	}

	public static void main(String[] args) {
		Priority t1 = new Priority();
		Priority t2 = new Priority();
		Priority t3 = new Priority();
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		

		t1.setPriority(1);
		t2.setPriority(10);
		t3.setPriority(5);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
