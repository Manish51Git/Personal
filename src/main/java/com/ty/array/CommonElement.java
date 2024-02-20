package com.ty.array;

import java.util.HashSet;

public class CommonElement {
	public static void main(String[] args) {
		String []s1= {"Apple","Ball","Cat","Dog","Elephant","Fish"};
		String[]s2= {"Ball","Dog","Fish","Rat","Kite"};
        
		HashSet<String> hset=new HashSet<>();
		for(int i=0; i<s1.length;i++) {
			for(int j=0; j<s2.length; j++) {
				if(s1[i].equalsIgnoreCase(s2[j])) {
					boolean add = hset.add(s1[i]);
					
				}
			
			}
			
		}
		System.out.println(hset);
		
	}
	

}
