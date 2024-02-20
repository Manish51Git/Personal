package com.ty.pattern;

public class AtoZ {
	static int n = 0;
	static int blank = 0;
	static int temp;

	public static void main(String[] args) {
		
//		System.out.println();
//
//		for (int i = 0; i < 5; i++) {
//            for(int j=0; j<5; j++) {
//            	if(j>i)
//            	System.out.print(i+" ");
//            }
//		System.out.println();
//		}
		
		//System.out.println(blank);
		
		
		
		
//		for (int i = 0; i < 5; i++) {
//		for (int j = 0; j < 5; j++) {
//			if (i == 0 || i == 4 ||  i==1 && j==3 || i==2 && j==2 || i==3 && j==1) {
//				System.out.print("* ");
//			} else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//	}
//	System.out.println();
//
//	for (int i = 0; i < 5; i++) {
//		for (int j = 4; j >=0; j--) {
//			if (i == 0 || i == 4 ||i==j) {
//				System.out.print("* ");
//			} else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//	}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i == j || i == 0 && j == 4 || i == 1 && j == 3 || i == 3 && j == 1 || i == 4 && j == 0) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//
//			}
//			System.out.println();

//		}
//		System.out.println();
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i == 0 || i == 2 || i == 4 ||j==0|| i == 1 && j == 4 || i==3&& j==4) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//
//			}
//			System.out.println();
//
//		}
		System.out.println();
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (j == 0 || i == 2 && j == 1 || i == 1 && j == 2 || i == 0 && j == 3 || i == 3 && j == 2
//						|| i == 4 && j == 3) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for (int i = 0; i < 6; i++) {
//			for (int j = 0; j < 6; j++) {
//				if (i == 0 || i < 4 && j == 0 || i == 3 && j < 3 || i == 2 && j == 2 || i == 2 && j >= 3
//						|| i == 3 && j == 5 || i == 3 && j == 6) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i == 0 || j == 4 || i == 2 && j == 2 || i == 2 && j == 3 || i == 3 && j == 2
//						|| i == 4 && j == 2 || i == 4 && j == 3 || i == 1 && j == 0) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for (int i = 0; i <= 5; i++) {
//			for (int j = 0; j <= 5; j++) {
//				if ((i==0 && j>0 && j<5 )||(j==5&& i>0&& i<5)||(i==5 && j>0 && j<5)||j==0 && i>0&& i<5) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ((i==j)|| i+j==4) {
					
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	
	}
}
