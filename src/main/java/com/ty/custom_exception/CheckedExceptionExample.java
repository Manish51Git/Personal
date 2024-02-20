package com.ty.custom_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {
	public static void main(String[] args) {
		FileInputStream fileInputStream=null;
		 try {
			 fileInputStream = new FileInputStream("C://unavailableDoc.txt");
		} catch (FileNotFoundException e) {
			System.out.println("file is not found in the provided location "+e);
			//System.exit(0);
		}
		 finally {
			System.out.println("finally got executed!!! ");
		}
		 
		
	
	}


}
