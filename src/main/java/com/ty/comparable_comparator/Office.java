package com.ty.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Office {
public static void main(String[] args) {
	ArrayList<Employee> list = new ArrayList<Employee>();
	list.add(new Employee(112, "Raju", 50000));
	list.add(new Employee(121, "Sonu", 50000));
	list.add(new Employee(184, "Monu", 70000));
	list.add(new Employee(192, "Deepak", 90000));
	list.add(new Employee(302, "Tina", 40000));
	System.out.println("sorting using comparator");
	Comparator<Employee> comparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
	};
	Collections.sort(list, comparator);
	for(Employee emp: list ) {
		System.out.println(emp);
		
	}
	
}
}
