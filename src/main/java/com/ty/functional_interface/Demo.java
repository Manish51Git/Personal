package com.ty.functional_interface;

public class Demo extends Thread {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();

		System.out.println(name);

	}

	public static void main(String[] args) {
		Demo demo1 = new Demo();
		Demo demo2 = new Demo();
		Demo demo3 = new Demo();
		demo1.setName("Manish");
		demo2.setName("Brunda");
		demo3.setName("Tapas");
		demo1.start();
		demo2.start();
		demo3.start();

	}

}
