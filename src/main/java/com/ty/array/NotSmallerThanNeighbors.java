package com.ty.array;

import java.util.Arrays;

public class NotSmallerThanNeighbors {
	
	public static void main(String[] args) {
		NotSmallerThanNeighbors.m1();
		}
	
	public static void m1() {
		int [] arr= {8,4,7,2,13,14,1,3,1,3,1,3};
		int [] bucket=new int[1];
		int count=0;
		Boolean check;
		
		for(int i=1; i<arr.length-1; i++) {
			
			int right = arr[i+1];
			int left = arr[i-1];
			
			System.out.println(right+":"+arr[i]+":"+left);
			if(arr[i]>left && arr[i]>right ) {
				if(bucket.length==count) {
					bucket = Arrays.copyOf(bucket, bucket.length+1);
				}
				bucket[count]=arr[i];
				count++;
				}
			}
		System.out.println("Greater value from neighbors is: "+ Arrays.toString(bucket));

	}
	}


