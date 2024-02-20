package com.ty.multithreading;

public class StopDemo extends Thread {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=1; i<=3; i++) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		StopDemo t1 = new StopDemo();
		StopDemo t2 = new StopDemo();
		StopDemo t3 = new StopDemo();
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		t1.start();
		t2.start(); 
		t3.start(); 
		t3.stop();
	}

}
