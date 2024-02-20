package com.ty.array;

import java.util.HashSet;

public class DuplicateArray {
	public static void main(String[] args) {
		int [] arr= {10,12,15,12,18,12,10,20,18};
		HashSet<Integer> hashSet = new HashSet<>();
		for (int element : arr) {
			if(!hashSet.add(element)){
			//hashSet.add(element);
			System.out.println(element);
			}
		}
		
		
			
			
		}
	}


