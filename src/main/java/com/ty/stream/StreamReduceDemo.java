package com.ty.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamReduceDemo {
	public static void main(String[] args) {
		//int a[]= {12,15,14,21,25,28,9};
//		List<int[]> asList = Arrays.asList(a);
		
//		List<Integer> asList=Arrays.asList(10,9,12,15,18,53,50,50,50,10);
//		asList.stream().filter((n)->n%3==0).forEach(System.out::println);
//		Long collect = asList.stream().filter(p->p%3==0).collect(Collectors.counting());
//		System.out.println("no.of divide by 3 is:"+collect);
		
//		List<Integer> collect2 = asList.stream().filter(p->p%2==0).collect(Collectors.toList());
//		boolean anyMatch = collect2.stream().allMatch(i->i>10);
//		System.out.println(collect2);
//		System.out.println(anyMatch);
		
		
//		boolean anyMatch = asList.stream().filter(i->i%2==0).allMatch(i->i>10);
//		
//		System.out.println("is there any no. divided by 2 and greater  than 10 :"+anyMatch);
//		
//		List<Integer> collect2 = asList.stream().sorted().collect(Collectors.toList());
//		System.out.println("assending"+collect2);
//		//reverse order
//		asList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
//		System.out.println("remove duplicate");
//		asList.stream().sorted().distinct().collect(Collectors.toList()).forEach(System.out::println);
//		// find duplicate values
//		Set<Integer> collect3 = asList.stream().filter(i->Collections.frequency(asList, i)>1).collect(Collectors.toSet());
//		System.out.println(collect3);
		
		List<Integer> asList = Arrays.asList(10,15,154,12,12,15,15,87,98,7,3);   
		
		asList.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("********************");
		asList.stream().sorted().distinct().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("prime num:");
		asList.stream().filter(StreamReduceDemo::isPrime).forEach(System.out::println);
		
	}
	public static boolean isPrime(int num) {
		
		for(int i=2; i<= num/2; i++) {
			if(num %i==0) {
				return false;
			}
		}
		
		return true;
		
	}

}
