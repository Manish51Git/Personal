package com.ty.stream;

import java.util.HashSet;
import java.util.Set;

public class StringIndex {
	public static void main(String[] args) {
//		String str="Manish Kumar";
//		boolean isFound = false;
//		for (int i=0; i<str.length();i++) {
//			for(int j=i+1;j<str.length();j++) {
//				
//				if (str.charAt(i)==str.charAt(j)) {
//					System.out.println(str.charAt(j)+": is the First Repeated Character");
//					isFound=true;
//					break;
//				}
//				
//			}if (isFound) {
//				break;
//			}
//		}
//		
		
//		**********************************************************************************************
/*
 * using hash set repeted character
 */
		String str="Hello Everyone";
				 Set<Character> set = new HashSet<>();
				 for(int i=0; i<str.length();i++) {
					 if(!set.add(str.charAt(i))) {
						 System.out.println("first Repeated character is: "+str.charAt(i));
						 break;
						 
					 }
				 }
		
		
//		---------------------------------------------------------------------------------

//		//non repeated character
//				 String st="Ravi";
//				 String emp= "";
//				 
//				 for(int k=0; k<st.length(); k++) {
//					 
//				 }
//				 
	}

}

