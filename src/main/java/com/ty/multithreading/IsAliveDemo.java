package com.ty.multithreading;
/**
 *isAlive() method tells that particular method is alive or not it gives
 * result in boolean if it is used before start method gives false because that
 * thread is not started yet and after start method it gives true.
 */

public class IsAliveDemo extends Thread {
	@Override
	public void run()
	{
		System.out.println("Hello Everyone!!");
	}
	public static void main(String[] args) {
		IsAliveDemo t1 = new IsAliveDemo();
		IsAliveDemo t2 = new IsAliveDemo();
		
		System.out.println(t1.isAlive());
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
	}
}
