package com.ty.array;

public class RotateArray {

	public static void main(String[] args) {
//		int[] arr = new int[] { 1, 2, 3, 4, 5,6,7 };
//		int n = 2;
//		System.out.println("Original array: ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		for (int i = 0; i < n; i++) {
//			int lastElement;
//			lastElement = arr[arr.length - 1];
//			for (int j = arr.length - 1; j > 0; j--) {
//				arr[j] = arr[j - 1];
//			}
//			arr[0] = lastElement;
//		}
//		System.out.println();
//		System.out.println("Array after right rotation: ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		/*---------------------------------------------------------------------*/
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		int n = arr.length;
		int[] temp = new int[n];
		int [] result=new int [n];
		int k = 0;
		int d = 2;
		for (int i = arr.length - d; i < arr.length; i++) {
			temp[k] = arr[i];

			k++;
		}
		for (int i = 0; i < arr.length - d; i++) {
			temp[k] = arr[i];

			k++;
		}
		result=temp;
		for (int i : result) {
			System.out.print(i+" ");
		}
		
		
	}
}
