package com.ty.multithreading;
/**
 * interrupt() method just interrupt the execution of thread but that thread should
 * not be in running state, it works when thread is in waiting state(join(), sleep(), 
 * etc)
 *
 */

public class InterruptDemo extends Thread{
	@Override
	public void run() {
		try {
		for(int i=0; i<=5; i++) {
			System.out.println("thred 1 is running....");
			Thread.sleep(1000);
		}}
		catch (Exception e) {
			System.out.println("thred 1 is terminated");
		}
	}
	public static void main(String[] args) {
	 InterruptDemo t1 = new InterruptDemo();
	 t1.start();
	 t1.interrupt();
	}

}
