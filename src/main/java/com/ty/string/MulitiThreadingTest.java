package com.ty.string;

public class MulitiThreadingTest implements Runnable{

	@Override
	public void run() {
    System.out.println("Thread "+ Thread.currentThread().getId()+" is Running");		
	}

	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++) {
	MulitiThreadingTest test = new	MulitiThreadingTest();
	Thread thread = new Thread(test);
	thread.start();
	
	
		}
	 
	}
}

