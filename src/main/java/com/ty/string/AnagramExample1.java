package com.ty.string;

import java.util.Arrays;

public class AnagramExample1 {
	public static void main(String[] args) {
		String str = "CHECK";
		String str1 = "KCHCE";
		
		
		int arr[] = new int[str.length()];
		int arr1[] = new int[str1.length()];
		if (str.length() == str1.length()) {
			for (int i = 0; i < str.length(); i++) {
				arr[i] = str.charAt(i);
				arr1[i] = str1.charAt(i);
			}
		
		Arrays.sort(arr);
		Arrays.sort(arr1);
		boolean check = true;
		for (int i = 0; i < arr1.length; i++) {
			if (arr[i] != arr1[i]) {
				check = false;
			}
		}
		if (check)
			System.out.println("anagram");
		else
			System.out.println("not anagram");
		}else {
			System.out.println("not anagram beacause length differ");
		}
	}

}
