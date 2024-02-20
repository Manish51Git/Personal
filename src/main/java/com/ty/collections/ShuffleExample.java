package com.ty.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ShuffleExample {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Delhi");
		arrayList.add("Mumbai");
		arrayList.add("Karnatka");
		arrayList.add("Chennai");
		arrayList.add("Kolkata");
		System.out.println(arrayList);
//		Iterator<String> iterator = arrayList.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//			
//		}

//		Collections.shuffle(arrayList);
//		System.out.println(arrayList);

//		Collections.swap(arrayList, 2, 4);
//		System.out.println(arrayList);

//		Collections.fill(arrayList, "patna");
//		System.out.println(arrayList);

//		notworking
//		ArrayList<String> arraycopy = new ArrayList<>();
//		Collections.copy(arrayList,arraycopy );
//		System.out.println(arraycopy);
		
//		min gives the ascii base word which is min
		
//		String min = Collections.min(arrayList);
//		System.out.println(min);
		//System.out.println(arrayList);

//		max gives the ascii base word which is max
		String max = Collections.max(arrayList);
		System.out.println(max);
	}

}
