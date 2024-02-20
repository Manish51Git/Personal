package com.ty.custom_exception;
/*custom exception, creating a bank class 
 * if customer try to withdraw amount bigger than available it throws exception*/

class Bank {
	static int balance=5000;
	static int withdraw;

	Bank(int withdraw) {
		this.withdraw = withdraw;
	}

	public void withdrawBalance() {
		if (withdraw <= balance) {
			System.out.println("Ammount "+withdraw+" withdrawn Successfully");
			balance=balance-withdraw;
			System.out.println("Available Balance: "+balance);
		} else {
			throw new InsufficientBalanceException("insufficient balance");
		}
	}

}

class InsufficientBalanceException extends RuntimeException {
	InsufficientBalanceException(String message) {
		super(message);
	}
}

public class Customer {
	public static void main(String[] args) {
		Bank bank = new Bank(120);
		bank.withdrawBalance();
	
	}

}
