package com.ty.singleton_design;

import com.ty.student.Student;

public class StudentMain {
	public static void main(String[] args) {
		// Getting a object from singleton class
		School instance = School.getInstance();
		School instance2 = School.getInstance();
		System.out.println(instance == instance2);
		System.out.println(instance);
		System.out.println(instance2);

	}
}
