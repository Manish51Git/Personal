package com.ty.pattern;

public class Test {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <5; j++) {
				if (j == 0 || j == 4 || i==1 && j==1 || i==2 && j==2 || i==1 && j==3 ) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==0 || j==4 || i==0 || i==2 ) {
					System.out.print("* ");
				} else {
				System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				if(j==0||j==4 || i==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<5;i++) {
			for(int j=0; j<5; j++) {
				if(i==0|| i==4|| j==2) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
					
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4 || i == 2 || i == 1 && j == 4 || i == 3 && j == 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == 4 || i==2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++ ) {
				if(i==0 || j==0 || i==2 || i==1 && j==4 || i==3 && j==1 || i==4 && j==2 || i==4 && j==3) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			for(int j=0; j< 5; j++) {
				if(i==0|| i==2 || j==0 || j==4) {
					System.out.print("* ");
					
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i == 0 && j == 0 || i == 1 && j == 1 || i == 2 && j == 2 || i == 3 && j == 3 || i == 2 && j == 4
						|| i == 1 && j == 5 || i == 0 && j == 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		//System.out.println();
		for (int i=0; i<5; i++) {
			for(int j=0; j<5 ; j++) {
				if(i==0 || i==4 ||j==2) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==0 || j==4 || i==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==0 || i==2 || j==0|| j==4) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
