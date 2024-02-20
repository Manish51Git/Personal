package com.ty.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*
 * Predicate interface contains test method which retun type is boolean
 * */
public class PredicateDemo {

//	@Override
//	public boolean test(Integer t) {
//		if(t%2==0) {
//			return true;
//		}else {
//		return false;
//		}
//	}
	public static void main(String[] args) {
//		Predicate<Integer> predicateDemo = (Predicate<Integer>) new PredicateDemo();
//		boolean test = predicateDemo.test(25);
//		System.out.println(test);
		
		
//		Predicate<Integer> predicateDemo =(t)-> {
//			if(t%2==0) {
//				return true;
//			}else {
//			return false;
//			}
//		};
//		
//		System.out.println(predicateDemo.test(18));
		
		//--------------------------
		
		//Predicate<Integer> predicateDemo =t->t%2==0;
		//System.out.println(predicateDemo.test(189));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		list.stream().filter(predicateDemo).forEach(t-> System.out.println("even: "+t));
		list.stream().filter(t->t%2==0).forEach(t-> System.out.println("even: "+t));
	}

}
