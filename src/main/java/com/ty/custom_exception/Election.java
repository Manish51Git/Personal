package com.ty.custom_exception;

public class Election {
	
	public void validateAge(int age)  {
		if (age<18) {
			throw new InvalidAgeException("not eligible");
		}else {
			
		System.out.println("eligible for vote");
		}
	}
	public static void main(String[] args) {
		Election election = new Election();
		election.validateAge(21);
	}
}
