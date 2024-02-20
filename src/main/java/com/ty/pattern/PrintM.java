package com.ty.pattern;

public class PrintM {
	
	    public static void main(String[] args) {
	        int size = 6;
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                if (j == 0 || j == size - 1 || i == j || i + j == size - 1) {
	                    System.out.print("M");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}


