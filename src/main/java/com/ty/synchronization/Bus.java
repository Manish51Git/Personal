package com.ty.synchronization;

public class Bus implements Runnable {
   int availabel =1;
   int passenger;
   
	public Bus(int passenger) {
	this.passenger = passenger;
}

	@Override
	public synchronized void run() {
	String name = Thread.currentThread().getName();
	if(availabel>=passenger) {
		System.out.println(name+" reserved seat...");
		availabel=availabel-passenger;
	}else {
		System.out.println("sorry seat not available!");
	}
		
	}

}

