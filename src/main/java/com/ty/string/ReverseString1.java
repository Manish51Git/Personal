package com.ty.string;

public class ReverseString1 {
	public static void main(String[] args) {
		String str = "Manish";
		String empty = "";
//		for(int i=0; i<str.length(); i++) {
//			//str.charAt(i);
//			empty=str.charAt(i)+empty;
//			
//		} 
//		System.out.println(empty);

		// approach-1
		char[] charArr = str.toCharArray();
		for (int i = charArr.length - 1; i >= 0; i--) {
			System.out.print(charArr[i]);

		}
		System.out.println();
		// approach-2
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		//approach-3
		StringBuffer sb = new StringBuffer(str);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
		
		//approach-4
		StringBuilder stringBuilder = new StringBuilder(str);
		StringBuilder reverse2 = stringBuilder.reverse();
		System.out.println(reverse2);
	}

}
