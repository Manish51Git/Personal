package com.ty.string;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class Test {
	
	
	
	 //printing 1 to n without using loop
	 
//	public static void m1(int n) {
//		if(n<=10) {
//			System.out.println(n);
//			m1(n+1);
//		}
//	}
//	
	
	public static void main(String[] args) {
		//Test.m1(1);
		
		
		
	
//		for(int i=0; i<str.length(); i++) {
//			char charAt = str.charAt(i);
//			if (str.indexOf(charAt)==str.lastIndexOf(charAt)) {
//				
//				//System.out.print(charAt);
//				
//			}else {
//				System.out.print(charAt);
//			}
//			
//			
//			
//			
//		}
		
		//------------------findind n duplicate occurance
		String str ="Maaamnahnnish";
		
		HashMap<Character,Integer> hashMap = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(hashMap.containsKey(str.charAt(i))) {
				int integer = hashMap.get(str.charAt(i));
			   hashMap.put(str.charAt(i), integer+1);
				
			}else {
				hashMap.put(str.charAt(i), 1);
			}
		}

		
		Iterator<Entry<Character, Integer>> iterator = hashMap.entrySet().iterator();
		while(iterator.hasNext()) {
			  Entry<Character, Integer> next = iterator.next();
			System.out.println(next.getKey()+" present "+next.getValue()+" time..");
			
		}
		System.out.println("\n");
	//	hashMap.entrySet().stream().sorted().forEach(System.out::println);
		
		
		
	}
}

