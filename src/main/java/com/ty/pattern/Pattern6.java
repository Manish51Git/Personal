package com.ty.pattern;

/*
            1
          1 2
        1 2 3
      1 2 3 4
    1 2 3 4 5
*/
public class Pattern6 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j =n*2-i ; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();

		}
	}

}
