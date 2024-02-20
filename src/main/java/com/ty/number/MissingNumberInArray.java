package com.ty.number;

import java.util.ArrayList;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int [] a= {1,2,3,5,7,8,9,10};
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			arrayList.add(a[i]);
		}
		
		for(int i=1;i<=20;i++) {
			if(!arrayList.contains(i)) {
				System.out.println(i);
			}
		}
		

		
		
		
	}

}
