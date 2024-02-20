package com.ty.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 *Consumer interface having  Void accept(T t) method which return type is void 
 **/

public class ConsumerDemo {

	
	
	public static void main(String[] args) {
//		Consumer<Integer> consumer = new ConsumerDemo();
//		consumer.accept(10);
		
		
		//Consumer<Integer> consumer=(t)-> System.out.println("printing value : "+t);
		//consumer.accept(151);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		//list.stream().forEach(consumer);
		list.stream().forEach((t)-> System.out.println("printing value : "+t));
		
		
	}
	

}
