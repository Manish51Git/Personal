package com.ty.string;

public class SwapString {
	public static void main(String[] args) {

		// swaping string
//		String name="Manish Kumar Paswan";
//		String[] split = name.split(" ");
//		
//		for(int m=split.length-1; m>=0; m--) {
//			System.out.print(split[m]+" ");
//		}
		// ---------------------------------------------------
//		String str=" Manish Umesh";
//		System.out.println("without trim: "+str+"Kumar");
//		System.out.println("After trim: "+str.trim()+"Kumar");// trim method remove the starting nd endibg space space of string 
//		
//		System.out.println(str.startsWith(" ")); //starts with
//		System.out.println(str.endsWith("h"));   // end with

		// -----------------------------------------------------------
		String word = "YashWarDhan985632M";
		String upper = "";
		String lower = "";
		String num= "";
		for (int i = 0; i < word.length(); i++) {
			char charAt = word.charAt(i);
			
			if (charAt >= 97 && charAt < 123) {
				
				lower = lower + charAt;
			}
			else if  (charAt > 64 && charAt < 91) {
				upper = upper + charAt;
			}else {
				num=num+charAt;
			}

		}

		

	}
	
	

}
