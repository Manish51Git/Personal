package com.ty.singleton_design;

public class School {
	// Make a static data member of instance
	private static final School instance = new School();

	// private constructor to avoid client applications to use constructor
	private School() {

	}

	// A public static method that returns instance
	public static School getInstance() {
		return instance;

	}

}
