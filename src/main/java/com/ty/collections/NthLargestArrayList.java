package com.ty.collections;

import java.util.ArrayList;
import java.util.Collections;

public class NthLargestArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(25);
		arrayList.add(75);
		arrayList.add(5);
		arrayList.add(85);
		arrayList.add(250);
		arrayList.add(80);
		arrayList.add(98);
		arrayList.add(2522);
		
		
		Collections.sort(arrayList);
		Integer secondHeighest  = arrayList.get(arrayList.size()-2);
		System.out.println(secondHeighest);
		
		
	}

}
