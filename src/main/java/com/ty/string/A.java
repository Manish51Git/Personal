package com.ty.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class A {

	public static void main(String[] args) {

		// reverse string
	//	String str = "Manish kumar";
//	String emp="";
//	for(int i=str.length()-1;i>=0;i--) {
//		char charAt = str.charAt(i);
//		emp+=charAt;
//	}
//	System.out.println(emp);

//		System.out.println("occurance");
//		HashMap<Character, Integer> hashMap = new HashMap<>();
//		for (int i = 0; i < str.length(); i++) {
//			char charAt = str.charAt(i);
//			if (hashMap.containsKey(charAt)) {
//				Integer put = hashMap.put(charAt, +1);
//			} else {
//				Integer put = hashMap.put(charAt, 1);
//			}
//
//		}
//		Iterator<Entry<Character, Integer>> itr = hashMap.entrySet().iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		System.out.println("sum of numbers in alpha numeric string");
		int n=0;
		String str1="11a2b3abc54kd4";
		
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i)>=48 && str1.charAt(i)<=57) {//48-57 are ascii value for 0-9
				n+=str1.charAt(i)-48;
			}
			
		}
		System.out.println(n);

	}
}
