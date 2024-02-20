package com.ty.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
	public static void rmnToInt(String s) {
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
		hashMap.put('I', 1);
		hashMap.put('V', 5);
		hashMap.put('x', 10);
		hashMap.put('L', 50);
		hashMap.put('C', 100);
		hashMap.put('D', 500);
		hashMap.put('M', 1000);

		s = s.replace("IV", "IIII");
		s = s.replace("IX", "VIIII");
		s = s.replace("XL", "XXXX");
		s = s.replace("XC", "LXXXX");
		s = s.replace("CD", "CCCC");
		s = s.replace("CM", "DCCC");

		int number = 0;
		for (int i = 0; i < s.length(); i++) {

			number = number + (hashMap.get(s.charAt(i)));
		}
		System.out.println(number);

	}

	public static void main(String[] args) {

		rmnToInt("IIIV");
	}
}
