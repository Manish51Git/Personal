package com.ty.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapToSet {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Orange");
		map.put(3, "Banana");
		map.put(4, "Lichi");
		map.put(5, "Pears");

		System.out.println(map);
		HashSet<Entry<Integer, String>> set = new HashSet<>(map.entrySet());
		Set<Object> set1 = new HashSet<>(map.values());
		// System.out.println(set1);
		Iterator<Entry<Integer, String>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			System.out.println(next.getKey());

		}
	}

}
