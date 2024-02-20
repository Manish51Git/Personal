package com.ty.array;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayReverse1 {
	public static void main(String[] args) {

		String [] str = { "Ravi", "Manish", "Ankeet", "Tapas", "Brunda" };
		String[] blank = new String[str.length];
		int m=0;
		for (int i = str.length - 1; i >= 0; i--) {
			blank[m++] = str[i];
			//System.out.println(str[i]);
		}
		//to short whatever in blank
		System.out.println(Arrays.toString(blank));
		//to reverse 
		Arrays.sort(blank,(e1,e2)->{
			return e2.compareTo(e1);
		});
		
		Arrays.sort(blank,Comparator.reverseOrder());
		Arrays.sort(blank,Comparator.naturalOrder());
		System.out.println(Arrays.toString(blank));

	
		
	}
}