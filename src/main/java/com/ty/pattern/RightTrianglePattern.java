package com.ty.pattern;

public class RightTrianglePattern {
	
	public static void pattern(int a) {
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" @");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		RightTrianglePattern.pattern(5);	
	}

}
