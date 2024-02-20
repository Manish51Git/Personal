package com.ty.multithreading;

public class YieldMain {
	public static void main(String[] args) {
		YieldDemo1 t1 = new YieldDemo1();
		YieldDemo2 t2 = new YieldDemo2();
		t1.setName("Thread1");
		t2.setName("Thread2");
//		t1.setPriority(10);
		t1.start();
		
		
		t2.start();
//		t2.yield();
//		for(int i=1; i<=3;i++) {
//			String name = Thread.currentThread().getName();
//			System.out.println(name);
//		}
	}

}
