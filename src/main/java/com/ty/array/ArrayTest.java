package com.ty.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ArrayTest {
	public static void main(String[] args) {
		/* -------------------minimum and maximum in array-------------------- */
//		int[] arr = { 10, 51, 17, 18, 20, 30,48,89,87 };
//		int min = arr[0];
//		int max = 0;
//		for(int i=0; i<arr.length;i++) {
//			if(min>arr[i]) {
//				min=arr[i];
//			}if(max<arr[i]) {
//				max=arr[i];
//			}
//		}
//		System.out.println("min: "+min);
//		System.out.println("max: "+max);

		/* find out duplicate array */
		// approach-1
		// int[] a = { 20, 50, 17, 19, 3, 19, 18, 15, 3 };
//		HashSet<Integer> set = new HashSet<>();
//		
//		for(int i=0; i<a.length; i++) {
//			if(!set.add(a[i])) {
//				System.out.println(a[i]);
//			}
//		}
		// approach-2
//		
		/*------------------ common elements in two different array----------------*/
//		int[] arr1 = { 10, 20, 15, 92, 30, 52, 56 };
//		int[] arr2 = { 15, 30, 105, 285, 37, 92, 76 };
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr2.length; j++) {
//				if (arr1[i] == arr2[j]) {
//					System.out.println("common elements is: " + arr1[i]);
//				}
//			}
//
//		}

		/*-----------------remove duplicate from array-----------------------------*/

//		int[] arr = { 10, 12, 15, 20, 32, 12, 15, 19, 72, 27 };
//
//		HashSet<Integer> hashSet = new HashSet<>();
//		for (int i = 0; i < arr.length; i++) {
//			hashSet.add(arr[i]);
//		}
//		System.out.println(hashSet);// directly printing hash set
//		Object[] array = hashSet.toArray();// converting hash set to array
//
//		for (Object object : array) { // advanced loop to iterate array object
//			System.out.println(object);
//    
//		
//		}
//		 int[] array2 = Arrays.stream(arr).distinct().toArray();//using stream
//		 for(int n:array2) {
//			 System.out.println("n: "+n);
//			 
//		 }

		/* find first and second largest number in arry */
//		int []arr= {15,15,34,94,74,265,1,5,154,154,214,264};
//		int firstLargest=0;
//		int secondLargest=0;
//		for(int i=0;i<arr.length;i++) {
//			if(firstLargest<arr[i]) {
//				firstLargest=arr[i];
//			}else if(secondLargest<arr[i]) {
//				secondLargest=arr[i];
//			}
//		}
//		System.out.println("FirstLargest: "+firstLargest +"  SecondLargest: "+secondLargest);

		/* second max */
//		int[] a= {2,5,1,6,4,8,10};
//		int max=a[0],secondmax=0;
//		int count=0;
//		 for (int i = 1; i < a.length; i++) {
//		        if (a[i] > max) {
//		        	secondmax = max;
//		        	max = a[i];
//		        } else if (a[i] > secondmax && a[i] != max) {
//		        	secondmax =a[i] ;
//		        }
//		    }
//		    
//		 System.out.println(secondmax);

		/*------------------------calculate average using array----------------*/

//		int []arr= {2,6,5,7,8,9,7,18};
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//		
//		}
//		System.out.println("sum of array: "+sum);
//		double avr=sum/arr.length;
//		System.out.println("average of array: "+avr);

		/*----------------taking user input-----------*/
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the Size of an array");
//		int size = sc.nextInt();
//		int sum = 0;
//		int[] arr = new int[size];
//		System.out.println("enter the array");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			sum += arr[i];
//		}
//
//		System.out.println("sum= " + sum);
//		double avg = sum / arr.length;
//		System.out.println(avg);

		/*--------------------------frequency of element in array------------------*/
//		int []arr= {10,12,15,18,20,10,15,17};
//		HashMap<Integer,Integer> map = new HashMap<>();
//		for(int i=0; i<arr.length;i++) {
//			if(map.containsKey(arr[i])) {
//				Integer integer = map.get(arr[i]);
//				map.put(arr[i], integer+1);
//			}else {
//				map.put(arr[i], 1);
//			}
//		}
//		System.out.println(map);
		/*-----------------array left rotation by d positions---------------*/
		// rotating left by 2
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
//		int n = arr.length;
//		int k = 0;
//		int[] temp = new int[n];
//		for (int i = 2; i < n; i++) {
//			temp[k] = arr[i];
//			k++;
//		}
//		for (int i = 0; i < 2; i++) {
//			temp[k] = arr[i];
//			k++;
//		}
//
//		
//		for(int i=0; i< temp.length;i++) {
//			arr[i]=temp[i];
//		}
//		//arr = temp;
//		for (int i : arr) {
//			System.out.print(i+" ");
//	}
//	
		/* right rotation */
//		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
//
//		int n = arr.length;
//		int[] temp = new int[n];
//		int[] result = new int[n];
//		int k = 0;
//		int d = 2;
//		for (int i = arr.length - d; i < arr.length; i++) {
//			temp[k] = arr[i];
//
//			k++;
//		}
//		for (int i = 0; i < arr.length - d; i++) {
//			temp[k] = arr[i];
//
//			k++;
//		}
//		result = temp;
//		for (int i : result) {
//			System.out.print(i + " ");
//		}
		/*-------------------------remove duplicate from an array-------------*/
//		int [] arr= {10,20,10,30,40,50,60,70,80,10,20,30};
//		//int res[]=new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					arr[i]=0;
//				//	arr[j]=0;
//					continue;
//				} 
//			}
//				
//		}
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=0)
//			System.out.print(arr[i]+" ");
//			
//		}
		/* using set */
//		int []arr= {10,20,30,40,50,50,40};
//		TreeSet<Integer> set = new TreeSet<>();
//		for(int i=0;i<arr.length;i++) {
//			set.add(arr[i]);
//			
//		}
//		System.out.println(set);

//		int []arr= {10,20,30,40,50,10,20,25};
//		for(int i=0; i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					arr[j]=0;
//				}
//			}
//		}
//		for (int i : arr) {
//			if(i!=0) {
//		System.out.print(i+" ");
//			}
//		}
		/*--------------largest number in array-------------*/
//		int []arr= {10,20,25,34,15,18};
//		int max=0;
//		for(int i=0;i<arr.length;i++) {
//			if(max<arr[i]) {
//				max=arr[i];
//			}
//		}
//		System.out.println("max"+max);
//		Arrays.sort(arr);
//		for (int i : arr) {
//			System.out.println(i);	
//		}
		/* sort the array using bubble sort */
//		int[] arr = { 10, 12, 15, 13, 18, 20, 25, 9, 7 };
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[j] > arr[j+1]){
////					System.out.println( "dcfvghbjn ");
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
		
		int [] arr= {10,12,15,18,14,16};
		
//		for(int i=) 

	}
}
