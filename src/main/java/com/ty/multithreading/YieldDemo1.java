package com.ty.multithreading;

public class YieldDemo1 extends Thread{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=1; i<=3;i++) {
			System.out.println(name);
			
		}
	}

	

}

