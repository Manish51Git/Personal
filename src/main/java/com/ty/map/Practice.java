package com.ty.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Practice {
	public static void main(String[] args) {
		HashMap<String,Integer> hashMap = new HashMap<>();
		hashMap.put("Bihar", 101);
		hashMap.put("Mumbai", 104);
		hashMap.put("Delhi", 102);
		hashMap.put("Karnatka", 106);
		hashMap.put("Rajsthan", 105);
		hashMap.put("Kolkata", 103);
		hashMap.put("Chennai", 107);
		
		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		System.out.println("hashmap without sorting");
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println( entry.getKey() +": "+entry.getValue());
			
		}
		System.out.println("shorting hashmap by key using tree map");
		TreeMap<String,Integer> treeMap = new TreeMap<>(hashMap);
		Set<Entry<String,Integer>> entrySet2 = treeMap.entrySet();
		for (Entry<String, Integer> entry : entrySet2) {
			System.out.println(entry.getKey()+" :"+entry.getValue());
			
		}
		System.out.println("sorting map by value using custom comarator");
		Comparator<Entry<String, Integer>> comparator = new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				Integer v1 = o1.getValue();
				Integer v2 = o2.getValue();
				return v1.compareTo(v2);
				 
			}
		};
		List<Entry<String, Integer>> listOfEntrySet = new ArrayList<>(entrySet);
		Collections.sort(listOfEntrySet, comparator);
		
		for (Entry<String, Integer> entry : listOfEntrySet) {
		
		System.out.println(entry.getKey()+" :"+entry.getValue());
		}
		
	}
	

}
