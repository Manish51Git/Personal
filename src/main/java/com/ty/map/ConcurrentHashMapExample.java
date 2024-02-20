package com.ty.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	public static void main(String[] args) {
	 
		Map<String,Integer> map = new ConcurrentHashMap<>();
		map.put("Manish", 101);
		map.put("Ankeet", 251);
		map.put("Ravi", 131);
		
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			
			System.out.println(m.getKey()+":"+m.getValue());
			
		}
	}

}
