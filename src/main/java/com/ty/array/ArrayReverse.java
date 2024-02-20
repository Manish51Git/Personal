package com.ty.array;

import java.util.Arrays;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] arr = { 20, 30, 40, 60, 65, 70 };
		int[] reverse= new int[arr.length];
		int n=0;
		for ( int i=arr.length-1; i >=0;  i--) {
          
		reverse[n++]=arr[i];
	
		System.out.println(reverse[i]);
		}
		//System.out.println(Arrays.toString(reverse));
	}

}
