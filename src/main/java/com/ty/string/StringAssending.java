package com.ty.string;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Map;
/*this program takes ascii value of each charecter present in string on the basis of ascii its been sorted
 * and again on the basis of sorting printing array */
public class StringAssending {
	public static void main(String[] args) {

		String str = "manish";
		int[] a = new int[str.length()];

		// int codePointAt = str.codePointAt(4);
		for (int i = 0; i < str.length(); i++) {
			int codePointAt = str.codePointAt(i);

			a[i] = codePointAt;
		System.out.println(a[i]);
		
		}
		Arrays.sort(a);
		String afterSorting="";
		System.out.println(Arrays.toString(a));
		char [] temp= new char[a.length];
		
		for(int i=0; i<=a.length-1;i++) {
			
			char j =(char) a[i];
			temp[i]=j;
			afterSorting+=j;
		}
		System.out.println(Arrays.toString(temp));
		System.out.println(afterSorting);
		
		
	}
	

}
