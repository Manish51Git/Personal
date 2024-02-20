package com.ty.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class OccuranceExample {
	public static void main(String[] args) {
		String str= "abcabc";
		HashMap<Character,Integer> hashMap = new HashMap<>();
		for(int i=0; i<=str.length()-1;i++) {
			if(hashMap.containsKey(str.charAt(i))) {
				Integer integer = hashMap.get(str.charAt(i));
				hashMap.put(str.charAt(i), integer +1);
				
			}else {
				hashMap.put(str.charAt(i), 1);
			}
			
		}
		Iterator<Entry<Character, Integer>> iterator = hashMap.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Character, Integer> next = iterator.next();
			
			System.out.println(next.getKey()+ "-"+ next.getValue());
			
		}
		
	}

}
