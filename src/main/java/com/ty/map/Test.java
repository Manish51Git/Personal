package com.ty.map;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		/*----------------------Occurrence of character in string------------*/
		String str = "i love programming";
		Map<String, Long> collect = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

		/*-------------------find duplicate character in string---------------------*/

		String str1 = "i love programming";
//		List<String> collect2 = Arrays.stream(str1.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
//		.stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
//		System.out.println("duplicate character: "+collect2);

		/*-------------------find out unique character--------------------*/
//		 List<String> collect = Arrays.stream(str1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
//		.stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());
//		 System.out.println("unique character"+collect);

		/*----------------find first non repeating character-------------*/

		String key = Arrays.stream(str1.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(o -> o.getValue() == 1).findFirst().get().getKey();
		// System.out.println(key);

		/*-----------------------------------short the array--------------------------*/
		int[] arr = { 10, 12, 8, 9, 18, 15, 21, 20, 16 };
		List<Integer> collect2 = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
		System.out.println(collect2);

		/*-----------------------------------short the array in reverse order--------------------------*/
		List<Integer> collect3 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(collect3);
		/*---------------------------find second maximum number in array----------------------*/
		Integer secondMax = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second max: "+secondMax);
        
        
        Integer thirdrdMax = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println("thirdrdMax: "+thirdrdMax);
        
        /*------------------------------longest String from given array-------------------*/
        String [] strArray= {"apple","ball","cat","dog","elephant"};
        String longString = Arrays.stream(strArray).reduce((word1, word2)->word1.length()>word2.length()? word1:word2).get();
        System.out.println(longString);
	}

}
