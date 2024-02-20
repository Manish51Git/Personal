package com.ty.rakuten;
/**
 * In a mountain of array find the highest number?
                           9
                      6       8
                   5     4      7
 */
public class MaxInPyramidArray {
	public static void main(String[] args) {
		int[][] arr = { { 0, 0, 9, 0, 0 }, { 0, 6, 0, 8, 0 }, { 5, 0, 4, 0, 7 } };
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		System.out.println(max);
	}

}
