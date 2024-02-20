package com.ty.collections;

import java.util.ArrayList;
//custom array list which does not take duplicate
public class CustomArrayList extends ArrayList{
	 @Override
	public boolean add(Object e) {
		 if(this.contains(e)) {
			 return true;
		 }else {
			 return super.add(e);
		 }
		
	}
	
	
	 public static void main(String[] args) {
		
//		 ArrayList list = new ArrayList();
		 CustomArrayList list = new CustomArrayList();
		 list.add(1);
		 list.add(1);
		 list.add(2);
		 list.add(2);
		 list.add(1);
		 list.add(1);
		 System.out.println(list);
	}


}
