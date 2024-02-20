package com.ty.number;

public class Palindrome {
	public static void main(String[] args) {
		int n, r, temp, sum=0; 
		n=151;//01010
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}

}
