package com.ty.custom_exception;

import java.util.Scanner;

public class OnlyTryBlock {
	public static void main(String[] args) {
		/*
		 * The only constraint is resources which we are passing as a parameter in try
		 * block must implement AutoCloseable interface, 
		 * as Scanner class implements AutoCloseable interface.
		 */
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("try without catch and finally block!");

		}

	}

}
