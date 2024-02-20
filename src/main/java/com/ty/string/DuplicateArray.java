package com.ty.string;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateArray {
	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,40,50};
//		HashSet<Integer> hashSet = new HashSet<>();
//		for(int i=0; i<=a.length-1;i++) {
//			if(!hashSet.add(a[i])) {
//				System.out.println(a[i]);
//			}}
			
			
		for(int i=0; i<=a.length-1;i++) {
			
			for(int j=i+1; j<=a.length-1; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
					
				}
			}
			
		}
	}

}
