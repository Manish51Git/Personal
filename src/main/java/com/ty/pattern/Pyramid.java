package com.ty.pattern;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter no of rows");
//		int noOfRows=sc.nextInt();
//		int rowCount=1;
//	
//		for(int i=noOfRows; i>=0; i--) {
//			 //Printing i spaces at the beginning of each row
//			
//			for(int j=1; j<=i; j++) {
//				System.out.print(" ");
//				
//			}
//			 //Printing 'rowCount' value 'rowCount' times at the end of each row
//			for(int j=1; j<= rowCount; j++) {
//				System.out.print(j+" "); //print rowCount or j
//			}
//			System.out.println();
//			//Incrementing the rowCount
//			rowCount++;
//			
//		}

		int[] a = new int[10];

		methodOne(a);

		System.out.print(a.length);

	}

	static void methodOne(int[] a) {
		int[] b = new int[5];

		a = b;

		System.out.print(a.length);

		System.out.print(b.length);
	}
}
