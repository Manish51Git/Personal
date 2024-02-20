// Program should be able to take input as information of N cricketers. Each cricketer has 3 attributes - Name, Jersey Number and Score. After the data entry is done,
//    - I should be able to search any cricketer's information by jersey number.
//    - I should be able to print all the N cricketers' information sorted by their respective score in ascending order.
//    - Report errors for appropriate failure cases.

package com.ty.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cricketers {

	private String name;

	private Integer jersyNumber;

	private Integer score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getJersyNumber() {
		return jersyNumber;
	}

	public void setJersyNumber(Integer jersyNumber) {
		this.jersyNumber = jersyNumber;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Cricketers(String name, Integer jersyNumber, Integer score) {
		super();
		this.name = name;
		this.jersyNumber = jersyNumber;
		this.score = score;

	}

	@Override
	public String toString() {
		return "Cricketers [name=" + name + ", jersyNumber=" + jersyNumber + ", score=" + score + "]";
	}

	public static void main(String[] args) {

		Cricketers p1 = new Cricketers("Rohit", 44, 122);
		Cricketers p2 = new Cricketers("Virat", 17, 67);
		Cricketers p3 = new Cricketers("Dhoni", 07, 777);
		Cricketers p4 = new Cricketers("Ravi", 4, 12);
		Cricketers p5 = new Cricketers("kholi", 4, 122);

		List<Cricketers> list = Arrays.asList(p1, p2, p3, p4, p5);
		
//		Cricketers cricketers = list.stream().filter(t -> t.getJersyNumber().equals(4)).findFirst().get();
//		System.err.println(cricketers);
//		System.err.println("===========================");
//		list.stream().sorted((o1, o2) -> o1.getScore().compareTo(o2.getScore())).forEach(System.out::println);
//
//		System.out.println("====================================================================");
//
//	list.stream().filter(s->s.getJersyNumber().equals(4)).findFirst().get();
		

	
list.stream().sorted((t1,t2)-> (int)(t2.getJersyNumber()-t1.getJersyNumber())).forEach(System.out::println);
	



}}