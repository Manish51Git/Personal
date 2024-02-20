package com.ty.concurrent;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/*fail safe allow to modify while iterating a collection.
 * */
public class FailSafeList {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("Delhi");
		list.add("Mumbai");
		list.add("Kolkata");
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
			list.add("Karnatka");
		}
	}

}
