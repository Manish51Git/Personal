package com.ty.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 * Program to print even numbers from list of elements using filter() and forEach() of Stream interface.
 */
public class EvenNumber {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,12,15,18,20,25,89,56);
//		list.stream().filter((n)-> n%2==0).forEach(System.out::println);
//		Long collect = list.stream().filter(i->i%2==0).collect(Collectors.counting());
//		System.out.println("No. Divided by 2is:"+collect);
		
		list.stream().filter(i->i%i==0).forEach(System.out::println);
		
		
		
	}

}
