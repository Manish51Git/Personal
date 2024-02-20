package com.ty.string;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str="   j   a   v  a";
		
		//approach-1
		String replaceAll = str.replaceAll("\\s", "");
		System.out.println(replaceAll);
		
		//approach-2
		String blank="";
		for(int i=0; i<=str.length()-1;i++) {
			if(str.codePointAt(i)!=32) {
				blank+=str.charAt(i);
			}
		}
		System.out.println(blank);
	}

}
