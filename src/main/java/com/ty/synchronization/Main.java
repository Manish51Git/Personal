package com.ty.synchronization;
/*method level synchronization */
 class Table {
	
	public synchronized void printTable(int n) {
		for(int i=1; i<=10;i++) {
			System.out.println(i*n);
		}
	}

}
class Thread1 extends Thread{
	Table t1;
	Thread1(Table t1){
		this.t1=t1;
	}
	
	@Override
	public void run() {
		t1.printTable(5);
	}
	
}
class Thread2 extends Thread{
	Table t1;
	Thread2(Table t1){
		this.t1=t1;
	}
	@Override
	public void run() {
		t1.printTable(7);
	}
}
class Thread3 extends Thread{
	Table t1;
	Thread3(Table t1){
		this.t1=t1;
	}
	@Override
	public void run() {
		t1.printTable(10);
	}
}
public class Main{
	public static void main(String[] args) {
		Table table = new Table();
		Thread1 thread1 = new Thread1(table);
		Thread2 thread2 = new Thread2(table);
		Thread3 thread3 = new Thread3(table);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
