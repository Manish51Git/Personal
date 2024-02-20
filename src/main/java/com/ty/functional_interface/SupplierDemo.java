package com.ty.functional_interface;

import java.util.Arrays;
import java.util.List;


/*Supplier<T> interface having    T get() method which return type is type
 * */
public class SupplierDemo{

	
	
	public static void main(String[] args) {
		
//		Supplier<String> supplierDemo =()-> {
//			return "Hello Everyone!!!";
//		};
		
//		supplierDemo.get();
//		System.out.println(supplierDemo.get());
		
	//	Supplier<String> supplierDemo =()-> "Hello Everyone!!!";
		//System.out.println(supplierDemo.get());
		
		List<String> asList = Arrays.asList();
//		String orElseGet = asList.stream().findAny().orElseGet(supplierDemo);
//		System.out.println(orElseGet);
		
		String orElseGet = asList.stream().findAny().orElseGet(()->"Hello Manish");
		System.out.println(orElseGet);
		
		
	}

	

}
