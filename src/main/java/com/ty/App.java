package com.ty;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

//		HashSet<String> hs = new HashSet<>();
//		hs.add("Delhi");
//		hs.add("Mumbai");
//		hs.add("Patna");
//		hs.add("Delhi1");
//		hs.add("Mumbai2");
//		hs.add("Patna3");
		// LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();
//		 Hashtable<Integer, String> hm = new Hashtable<>();
//		hm.put(15, "delhi");
//		hm.put(225, "Mumbai");
//		hm.put(354, "Kolkata");
//		hm.put(4514, "Bengaluru");
//		
//		Iterator<Entry<Integer, String>> iterator = hm.entrySet().iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//			
//		}
		// -------------------------------

		// String intern

//		String s1= new String("JAVA");
//		String s2 = s1.intern();
//		System.out.println(s1==s2); //comapring ref // false
//		System.out.println(s1.equals(s2)); // comparing object //true

//		String s3= "MANISH";
//		String s4 = s3.intern();
//		System.out.println(s3==s4);
//		System.out.println(s3.equals(s4));
//		

//		String str = "Manish";
//
//		str.chars().mapToObj(t -> (char) t).filter(t -> t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u')
//				.forEach(t -> System.err.println(t));
		
		String s1 = new String("JAVA");
		String s2 = s1.intern();
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
