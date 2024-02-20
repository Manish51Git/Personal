package com.ty.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableExample {
	public static void main(String[] args) {
  Hashtable<String, Integer> table = new Hashtable<>();
  
  	
	table.put("Lenovo",25000);
	table.put("Asus",35000);
	table.put("Hp",45000);
	table.put("Hop",499000);
	Object[] array = table.entrySet().toArray();
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[3]);
	}
	
	
		for (Map.Entry<String, Integer> m: table.entrySet()) {
			System.out.println(m.getKey()+" :"+m.getValue());
			
		}
	}
	
		
	}


