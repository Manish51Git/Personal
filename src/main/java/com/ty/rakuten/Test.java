package com.ty.rakuten;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("9", "Apple");
		hashMap.put("5", "Grapes");
		hashMap.put("3", "Pears");
		hashMap.put("7", "Mango");
		hashMap.put("4 ", "Guava");
		hashMap.put("2 ", "Banana");
		
		System.out.println("----------before sorting------");
		Set<Entry<String, String>> entrySet = hashMap.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry);
		}

		System.out.println("------after sorting-------------");
		TreeMap<String, String> treeMap = new TreeMap<>(hashMap);
		Set<Entry<String, String>> entrySet2 = treeMap.entrySet();

		for (Entry<String, String> entry : entrySet2) {

			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	/*-----------------------------------------------------------------------------------------------*/	
		/*-----------------using comparator comparing value--------------------*/
		Comparator<Entry<String, String>> comparator = new Comparator<Entry<String, String>>() {

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				String value1 = o1.getValue();
				String value2 = o2.getValue();
				return value1.compareTo(value2);
			}
		};
		/*to sort by value need list */
		ArrayList<Entry<String,String>> list = new ArrayList<Entry<String, String>>(entrySet);
		Collections.sort(list, comparator);
		
		/*--------after sorting we need to store that value in linked hashmap so that 
		 * it could preserve insertion order
		 * */
		LinkedHashMap<String,String> sortedvalue = new LinkedHashMap<String, String>(list.size());
		
		for (Entry<String, String> entry : list) {
			sortedvalue.put(entry.getKey(), entry.getValue());
			
		}
		System.out.println("after sorting by value");
		
		/*here to iterate through LinkedHashMap */
		Set<Entry<String,String>> entrySet3 = sortedvalue.entrySet();
		for (Entry<String, String> entry : entrySet3) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}

}
