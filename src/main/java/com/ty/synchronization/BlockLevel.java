package com.ty.synchronization;
                       /*Block Level Synchronization*/
class Message {

	public void show(String name) {

		synchronized (this) {// block level synchronization

			for (int i = 1; i <= 3; i++) {
				System.out.println("Welcome" + name);
			}
		}
	}

}

class OurThread extends Thread {
	Message m;
	String name;

	public OurThread(Message m, String name) {
		this.m = m;
		this.name = name;
	}

	@Override
	public void run() {
		m.show(name);

	}

}

public class BlockLevel {
	public static void main(String[] args) {

		Message message = new Message();
		OurThread t1 = new OurThread(message, " Anikt");
		OurThread t2 = new OurThread(message, " Ravi");
		OurThread t3 = new OurThread(message, " Manish");
		t1.start();
		t2.start();
		t3.start();
	}

}
