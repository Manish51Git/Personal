package com.ty.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class B {

	public static void main(String[] args) {
		/*
		 * -----------------count all the punctuation present in
		 * string--------------------------
		 */
//		String str = "abc'd/%=&e?8(9]";
//		String blank = "";
//		String punc = "";
//		int count=0;
//		for (int i = 0; i < str.length(); i++) {
//			if ((str.charAt(i) >= 48 && str.charAt(i) <= 57) || (str.charAt(i) >= 65 && str.charAt(i) <= 90)
//					|| (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
//				blank += str.charAt(i);
//			} else {
//				punc += str.charAt(i);
//				count++;
//			}
//			
//		}
//		System.out.println(punc);
//		System.out.println(count);

		/* total no. of vowels and consonants present */
//		String str="ABCghjDEI";
//		int n=0;
//		int consonants=0;
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'
//					||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'
//					||str.charAt(i)=='A') {
//				n++;
//				
//			}else {
//				consonants++;
//			}
//		}
//		System.out.println("no of vowels: "+n);
//		System.out.println("no of consonants: "+consonants);

		/*
		 * -----------------------------String is anagram or
		 * not-------------------------------
		 */
		/* String anagram */
		String a = "manish";
		String b = "ishamn";
//		char[] charArray = a.toCharArray();
//		char[] charArray2 = b.toCharArray();
//		Arrays.sort(charArray);
//		Arrays.sort(charArray2);
//		boolean equals = Arrays.equals(charArray, charArray2);
//		if (Arrays.equals(charArray, charArray2)) {
//			System.out.println("anagram");
//		} else {
//			System.out.println("not anagram");
//		}
//		String blank = "";
//		for (int i = 0; i < a.length(); i++) {
//
//			for (int j = 0; j < b.length(); j++) {
//				if (a.length() == b.length()) {
//					if (a.charAt(i) == b.charAt(j)) {
//						blank += a.charAt(i);
//
//					}
//
//				}
//			}
//		}
//			if(blank.equals(a)) {
//				System.out.println("it is anagram");
//			}else {
//				System.out.println("it is not anagram");
//			}
//		

		// ----------------------------------------------------------
		/* ---------------------Divide String in N Parts------------------------ */

		// procedure-1
		String st = "TestYantraJayaNagar";
//		String substring = st.substring(st.length() / 3);
//		System.out.println(substring);
//
		String[] split = st.split("a", 3);
		for (String string : split) {
			// System.out.println(string);
		}
		/* procedure-2 */
//		String check="My name is Manish Kumar";
//		Scanner sc = new Scanner(check);
//		
//		while (sc.hasNext()) {
//		
//			System.out.println(sc.next());
//			
//		}
		/* procedure-3 */
//		StringTokenizer stringTokenizer = new StringTokenizer(st, a);
//		while (stringTokenizer.hasMoreElements()) {
//			System.out.println();
//			System.out.println(stringTokenizer.nextToken());		
//		}
//		String str="fun";
//		int len = str.length();
//		String arr[]=new String[len*len+1/2];
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = i; j < str.length(); j++) {
//				System.out.print(str.substring(i, j+1)+" ")

		/* subset of string like FUN->F,FU, FUN, U,UN,N */
		String sbstr = "Manish";
		int length = sbstr.length();
		// String arr[]=new String[length*length+1/2];
//		for(int i=0; i<sbstr.length();i++) {
//			for(int j=i;j<sbstr.length();j++) {
//				
//				System.out.println(sbstr.substring(i, j+1)+" ");
//			}
//		}
//		
		// -------------------------------------------------
		/*-----------------maximum and minimum occuring in string--------------*/

//		String st1="TesttaYatntra";
//		HashMap<Character,Integer> map = new HashMap<>();
//		for(int i=0;i<st1.length();i++) {
//			if(map.containsKey(st1.charAt(i))){
//				Integer integer = map.get(st1.charAt(i));
//				Integer put = map.put(st1.charAt(i), integer+1);
//			}else {
//				Integer put = map.put(st1.charAt(i), 1);
//				
//			}
//		}
//		 Entry<Character, Integer> entry = map.entrySet().stream().max(Entry.comparingByValue()).get();
//		 Entry<Character, Integer> entry2 = map.entrySet().stream().min(Entry.comparingByValue()).get();
//		System.out.println(map);
//		System.out.println("maximum occurance: "+entry);
//		System.out.println("minimum occurance: "+entry2);
//		

		/*----------------replace the spaces of the string with special character-----------------*/
//		String sti = "My name is Manish Kumar";
//		String replace = sti.replace(' ', '#');
//		System.out.println(replace);

		/*-----------------replace lower case with upper case and vice versa---------------------*/
//		String sg = "techno ElevaTe";
//		String blnk ="";
//		for (int i = 0; i < sg.length(); i++) {
//			char ch = sg.charAt(i);
//			if (ch >= 65 && ch <= 90) {
//				blnk =blnk+ (char)(ch+32);
//				
//			}else if(ch>=97&&ch<=122) {
//				blnk =blnk +(char)(ch-32);
//			}else if(ch==' ') {
//				blnk+=ch;
//			}
//		}
//		System.out.println(blnk);

		/*----------palindrome------------*/

//		String str = "ABA";
//		String blnk = "";
//		for (int j = str.length() - 1; j >= 0; j--) {
//
//			blnk = blnk + str.charAt(j);
//
//		}
//		if(str.equals(blnk)) {
//			System.out.println(str+ " :is palindrome");
//		}else {
//			System.out.println(str+" :is not palindrome");
//		}
		/*---------------------reverse the string character by character---------------*/
//		String str = "My Name Is Manish Kumar";
//		String[] split2 = str.split("\\s");// this will create array of sentence
//		String empty ="";
//		for (int i = 0; i < split2.length; i++) {
//			String word = split2[i];
//			for (int j = word.length()-1; j >= 0; j--) {
//				char ch = word.charAt(j);
//				empty = empty + ch;
//			}
//			empty = empty + " ";
//		}
//		System.out.println(empty);

		/*------------------------reverse the string word by word---------------------------------*/
//		String str="I Love India";
//		char[] charArray = str.toCharArray();
//		String em="";
//		 String[] split3 = str.split("\\s");
//		for(int i=split3.length-1;i>=0;i--) {
//			String word = split3[i];
//			em=em+word+" ";
//		}
//		System.out.println(em);

		/*
		 * --------reverse the string word by word as well as character-I love
		 * programming-> gnimmargorP evoL I ---------------
		 */
//		String str = "I Love Programming";
//		String[] split2 = str.split("\\s");
//		String emp = "";
//		for (int i = split2.length - 1; i >= 0; i--) {
//
//			String word = split2[i];
//			for (int j = word.length() - 1; j >= 0; j--) {
//				char c = word.charAt(j);
//				emp = emp + c;
//			}
//			emp = emp + " ";
//		}
//		System.out.println(emp);
		/*---------------find and print the  duplicate words in sting -------------*/
//		String str="you are awesome, i like your attitude, your positivity  attracts me" ;
//	
//		String[] split2 = str.split("\\s");
//		HashMap<String,Integer> hashMap = new HashMap<>();
//		for(int i=0;i<split2.length;i++) {
//		String word = split2[i];
//		if(hashMap.containsKey(word)) {
//			Integer integer = hashMap.get(word);
//			hashMap.put(word, integer+1);
//		}else {
//			hashMap.put(word, 1);
//		}
//			
//		}
//		System.out.println(hashMap);
//		Entry<String, Integer> maximumOcc = hashMap.entrySet().stream().max(Entry.comparingByValue()).get();
//	//	hashMap.entrySet().stream().anyMatch(Entry)
//		System.out.println(maximumOcc);
		
		//-------------------------------------------------------------------------------
		/*find out duplicate word in string*/
		String str="you are awesome, i like your attitude, your positivity  attracts me" ;
		
		String[] split2 = str.split("\\s");
		HashSet<String> hashSet = new HashSet<>();
		for(int i=0; i<split2.length;i++) {
			String word = split2[i];
			if(!hashSet.add(word)) {
				System.out.println(word);	
			}
		}
//		String demo="bottlee";
//		String[] split1 = demo.split("");
		
//		for (int i = 0; i < split1.length; i++) {
//			char temp=demo.charAt(i);
//			for (int j = i+1; j < split1.length; j++) {
//				if(temp==demo.charAt(j)) {
//					System.out.println(temp);
//				}
//			}
//		}
		
	}

}
