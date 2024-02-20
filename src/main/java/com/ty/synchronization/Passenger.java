package com.ty.synchronization;

public class Passenger {

	public static void main(String[] args) {
		Bus bus = new Bus(1);

		Thread t1 = new Thread(bus);
		Thread t2 = new Thread(bus);
		Thread t3 = new Thread(bus);
		t1.setName("Abhi");
		t2.setName("Aadi");
		t3.setName("Aalok");

		t2.start();
		t3.start();
		// t3.yield();
		t1.start(); 
	}

}
