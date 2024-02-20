package com.ty.pattern;
/*12345
 *1234
 *123
 *12
 *1 */
public class Pattern2 {

	public static void main(String[] args) {
		int row=5;
		for(int i=row; i>=0; i--) {
		//	System.out.print(i+" ");
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
