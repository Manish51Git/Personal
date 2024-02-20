package com.ty.array;

public class MinAndMaxArray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 88, 25, 77, 2, 35, 42 };

		int min = arr[0];
		int max = 0;

		for (int j = 0; j <= arr.length - 1; j++) {
			if (max < arr[j]) {
				max = arr[j];

			}
			if (min > arr[j]) {
				min = arr[j];

			}

		}

		System.out.println("maximum : "+max);
		System.out.println("minimum : "+min);

	}

}
