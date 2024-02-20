package com.ty.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*fail fast iterator does not allow to modify while iterating a collection 
 * */
public class FailFastList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Deepak");
		list.add("Inder");
		list.add("Shivam");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
			list.add("Shahil");
		}
		
	}

}
