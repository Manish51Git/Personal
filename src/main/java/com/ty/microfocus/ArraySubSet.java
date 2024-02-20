package com.ty.microfocus;

public class ArraySubSet {
	
	public static boolean isSubset(int arr1[], int arr2[], int m, int n){
		
		for(int i=0; i<n; i++) {
			for(int j=0; i<m; j++){
				if(arr2[i]==arr1[j]) 
					break;
				if(j==m)
					return false;
					
				
				
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50,3,6,9,5};
		int arr2[]= {3,6,9,5};
		
		int m=arr1.length;
		int n=arr2.length;
		
		if(isSubset(arr1,arr2,m,n)) {
			System.out.println("arr2is Subset of arr1");
		}
		else {
			System.out.println("arr2is NOT Subset of arr1");
			
		}
	}
	

}
