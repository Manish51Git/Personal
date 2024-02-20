package com.ty.array1;

import java.util.Arrays;
import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		/*-------------------------sort int and String Array--------------------------*/
//		int [] arr= {102,115,119,104,125,147,158};
//		String string = Arrays.toString(arr);
//		
//		System.out.println("Origional Array "+string);
//		Arrays.sort(arr);
//		
//		System.out.println("Sorted Array    "+Arrays.toString(arr));

//		String [] strArr= {"Java", "Python", "C++", "C#","Android"};
//		System.out.println("origional string array"+Arrays.toString(strArr));
//		Arrays.sort(strArr);
//		System.out.println("shorted String array"+Arrays.toString(strArr));

		/*----------------Java program to sum values of an array-------------------*/

//		int []arr= {15,25,15,12,28};
//		int sum=0;
//		for(int i=0; i<arr.length;i++) {
//			sum+=arr[i];
//			
//		}
//		System.out.println("sum of array= "+sum);

		/*---------------calculate the average value of array elements-----------------------*/

//		int arr[]= {10,18,15,17,25,27,29,30};
//		int sum=0;
//		double average;
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
//		average=sum/arr.length;
//		System.out.println("sum of array:     "+sum);
//		System.out.println("Average of Array: "+average);

		/*----------------program to test if an array contains a specific value---------------------*/
//		int[] arr = { 15, 18, 25, 35, 37 };
//
//		System.out.println(contain(arr, 37));
//		System.out.println(contain(arr, 36));
//
//	}
//
//	public static boolean contain(int[] arr, int num) {
//		for (int i : arr) {
//			if (i == num) {
//				return true;
//			} else {
//
//			}
//		}
//		return false;

		/* find index of the given element */

//		int[] arr = { 10, 15, 25, 35, 51, 41, 20};
//		int n=25;
//		int num=0;
//		for(int i=0; i<arr.length;i++) {
//			if(n==arr[i]) {
//				num=i;
//			}else {
//				//num=i+1;
//			}
//		}
//		System.out.println(num);
		/*------------------------------find the index of the array element-----------------------------*/
//		int [] arr= {15,20,25,39,40,55};
//		System.out.println("index of 55 is: "+findIndex(arr, 55));
//	}
//	
//	public static int findIndex(int []arr , int t) {
//		if(arr==null)return -1;
//		int i=0;
//		while (i<arr.length) {
//			if(arr[i]==t) return i;
//			else i=i+1;
//		}
//		return -1;

		/*--------------------------------remove particular element---------------------------------------------------*/

//		int[] arr = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
//		System.out.println("origional array" + Arrays.toString(arr));
//		// remove 14 from index 1
//		int remove = 2;
//		for (int i = remove; i < arr.length - 1; i++) {
//			arr[i] = arr[i + 1];
//		}
//		// after removing
//		System.out.println("new array      " + Arrays.toString(arr));

		/*----------------------------Copy an array by iterating the array---------------*/
//		int []arr= {10,20,30,40,50,60,70,80,90};
//		int [] newArr= new int[arr.length];
//
//		for(int i=0; i<arr.length;i++) {
//			newArr[i]=arr[i];
//		}
//		System.out.println("sourced array"+Arrays.toString(arr));
//		System.out.println("new array    "+Arrays.toString(newArr));

		/*-------------- Insert an element into an array--------------------------------*/
//		int[] arr = { 54, 12, 65, 32, 40, 86, 15, 64, 35, 51, 33 };
//		int index = 2;
//		int newValue = 5;
//
//		for (int i = arr.length - 1; i > index; i--) {
//			arr[i] = arr[i];
//
//		}
//		System.out.println("origional Array: " + Arrays.toString(arr));
//		arr[index] = newValue;
//		System.out.println("new Array:       " + Arrays.toString(arr));
		/*-----------------------10.Find Max and Min  value of Array-----------------------------------*/
//
//		int arr[] = { 12, 15,10, 81, 16,300, 52, 85, 49 };
//		int min = arr[0];
//		int max = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i]>max   ) {
//				max = arr[i];
//				 
//
//			}else if(arr[i]<min) {
//				min=arr[i];
//			}
//			
//
//		}
//		System.out.println("max :"+max);
//		System.out.println("min :"+min);
		/*-----------------11. reverse an array of integer values--------------------*/
		
//		int [] arr= {10,20,30,40,50,60,70,80,90};
//		int []temp=new int[arr.length];
//		int n=0;
//		for(int i=arr.length-1;i>=0;i--) {
//			temp[n++]=arr[i];
//		}
//		System.out.println(Arrays.toString(temp));
		
		/*-------------------------------frequency of number in array---------------------------------------------*/
		int [] arr= {15,14,18,98,45,6,54,25,14,18};
		
		HashMap<Integer, Integer> map = new HashMap<>();
			for(int i=0; i<arr.length;i++) {
				if(map.containsKey(arr[i])) {
					Integer integer = map.get(arr[i]);
					map.put(arr[i], integer+1);
					
				}else {
					map.put(arr[i], 1);
				}
				
			}
			System.out.println(map);
		
	}

}
