package com.ty.synchronization;

class Bank extends Thread {
	static int balance;
	static int withdraw;

	Bank(int balance, int withdraw) {
		this.balance = balance;
		this.withdraw = withdraw;
	}

	public static synchronized void withdraw() {
		String name = Thread.currentThread().getName();
		if (withdraw <= balance) {
			System.out.println(name + " withdrawn money");
			balance = balance - withdraw;
		} else {
			System.out.println("sorry " + name + "!! Insufficient balance");
		}
	}

	@Override
	public void run() {
		withdraw();
	}
}

public class Customer {
	public static void main(String[] args) {
		Bank bank = new Bank(5000, 5000);
		 Bank bank1 = new Bank(5000, 5000);
		Thread t1 = new Thread(bank);
		Thread t2 = new Thread(bank);
		 Thread t3 = new Thread(bank1);
		 Thread t4 = new Thread(bank1);

		t1.setName("Deepak");
		t2.setName("Pooja");
		 t3.setName("Inder");
		 t4.setName("Chandani");
		t1.start();
		t2.start();
		 t3.start();
		 t4.start();
	}
}
