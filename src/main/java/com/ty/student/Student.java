package com.ty.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Student {
	private int rollNo;
	private String name;
	private int age;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student() {
		super();
	}

	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
 		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		Student student = new Student(1, "Ravi", 10);
		Student student2 = new Student(2, "Rakesh", 12);
		Student student3 = new Student(3, "Tapas", 15);
		Student student4 = new Student(5, "Brunda", 10);
		Student student5 = new Student(2, "Sahid", 18);
		Student student6 = new Student(15, "Inder", 12);

		List<Student> list = Arrays.asList(student, student2, student3, student4, student5, student6);
		
		
		
//		
//		Comparator<Student> std = (s1, s2) -> {
//			return s1.getAge() - s2.getAge();
//		};
//		list.stream().sorted(std).forEach(System.out::println);
//		// ------------------------------------------------------------------
//		System.out.println("-------------------------------------------------");
//		Comparator<Student> std1 = (s1, s2) -> {
//			return s1.getName().compareTo(s2.getName());
//		};
//		list.stream().sorted(std1).forEach(System.out::println);
//
//		System.out.println("--------------------------------------------------------");
//
//		Comparator<Student> std2 = (e1, e2) -> {
//			return e1.getAge() - e2.getAge();
//
//		};
//		list.stream().sorted(std2).forEach(System.out::println);

//		list.stream().filter(t -> t.getJersyNumber().equals(4)).findFirst().get();
		
		MyComparator myComparator = new MyComparator();
		
		Comparator<Student> abc= (m1,m2)->{
			return m1.getName().compareTo(m2.getName());
			
		};
		//list.stream().sorted(abc).forEach(System.out::println);
		
		
		//customize treeset constructor
		TreeSet<Student> treeSet = new TreeSet<>(myComparator);
		
		treeSet.addAll(list);
		
		Iterator<Student> iterator = treeSet.iterator();
		treeSet.forEach(i->System.out.println(i+" "));
		
	}
	
				
}
