package com.ty.pattern;
/*
 * A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
 * */


public class Pattern1 {

	public static void main(String[] args) {
		char row=70;
		for(char i=65; i<=row; i++) {
			
			for(char j=65; j<=i; j++) {
				System.out.print((char)j+" ");
			}
			System.out.println();
			
		}
		for(char i=69; i>=65; i--) {
			for(char j=65; j<=i; j++ ) {
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
	}
}
