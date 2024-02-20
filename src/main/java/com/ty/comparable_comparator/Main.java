package com.ty.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		ArrayList<Laptop> list = new ArrayList<>();
		list.add(new Laptop("Asus", 8, 22000));
		list.add(new Laptop("Lenovo", 4, 20000));
		list.add(new Laptop("Accer", 6, 25000));
		list.add(new Laptop("Hp", 12, 32000));

		System.out.println(" using comparable ");
		Collections.sort(list);
		for (Laptop laptop : list) {
			System.out.println(laptop);

		}

	}

}
