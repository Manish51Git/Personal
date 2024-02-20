package com.ty.map;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ShortMap {
	public static void main(String[] args) {
		
		
		
		Map<String,Integer> map = new HashMap<>();
		map.put("Ten", 10);
		map.put(null, 10);
		map.put(null, 12);
		map.put("Nine",9);
		map.put("Seven",7);
		map.put("Six",6);
		map.put("Five",5);
		map.put("Four", 4);
		
		 List<Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
		 Collections.sort(list, new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		for (Entry<String, Integer> entry : list) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
			
			
			
		// Entry<String, Integer> entry2 = map.entrySet().stream().filter(t->t.getKey().equalsIgnoreCase("Six")).findAny().get();
	//	System.out.println("*********"+entry2);
			
			
		}
		
	}


}
