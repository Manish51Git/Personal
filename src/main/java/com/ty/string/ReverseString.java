package com.ty.string;

public class ReverseString {
	public static void main(String[] args) {
		String str="manish";
	
		String newStr="";
		for(int i=0; i<str.length();i++) {
			char charAt = str.charAt(i);
			newStr=charAt+newStr;
			
	
		}
		System.out.println(newStr);
	}

}
