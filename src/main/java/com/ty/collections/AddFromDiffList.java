package com.ty.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddFromDiffList {
	public static void main(String[] args) {
//		List<Integer> list1 = new ArrayList<>();
//		list1.add(21);
//		list1.add(22);
//		list1.add(23);
//		list1.add(24);
//		list1.add(55);
//		list1.add(26);
//
//		List<Integer> list2 = new ArrayList<>();
//		list2.add(11);
//		list2.add(12);
//		list2.add(13);
//		list2.add(14);
//		list2.add(15);
//		list2.add(16);
//		List<Integer> list3 = new ArrayList<>(20);
//		for (int i = 0; i < list1.size(); i++) {
//			for(int j=0; j<list2.size(); j++)
//			if (i % 2 != 0 && j%2==0) {
//				list3.add(list1.get(i));
//				list2.add(list2.get(j));
//			} else {
//
//			}
//		}
//
//		System.out.println(list3);


		List<Integer> asList = Arrays.asList(11,13,15,17);
		List<Integer> asList1 = Arrays.asList(12,14,16,18);
		List newList=new ArrayList();
		int z=0,j=0;
		for(int i=0;i<8;i++) {
			if(i%2!=0) {
				newList.add(asList1.get(z++));
				
			}else {
				newList.add(asList.get(j++));
				
			}
		}
		System.out.println("final "+newList);
	}

}
