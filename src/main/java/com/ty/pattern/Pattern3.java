package com.ty.pattern;
/*1
 *1 2
 *1 2 3 4
 *1 2 3
 *1 2
 *1 */
public class Pattern3 {
public static void main(String[] args) {
	int n=5;
	for(int i=1; i<=n; i++) {
		 for(int j=1; j<=i; j++) {
			System.out.print(j+" "); 
		 }
		 System.out.println();
		
	}
	for(int i=n+1; i>=1; i--) {
		for(int j=1; j<=i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
}
}
