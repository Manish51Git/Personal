package com.ty.array1;

import java.util.Arrays;
import java.util.Comparator;

public class Brunda {
	public static void main(String[] args) {
		int arr[]= {1,3,5,2,7};
 Integer integer = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
 
//		System.out.println(integer);
		int min=arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		System.out.println(min);
		}
	}

}
