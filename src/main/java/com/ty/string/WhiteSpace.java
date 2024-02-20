package com.ty.string;

import java.util.Scanner;

public class WhiteSpace {

	 
	
	    public static void main(String[] args) 
	    {
	    	//useingMethod();
	    	useingArray();
	    }
	    
	   static void useingMethod() {
	    	  Scanner sc = new Scanner(System.in);
		         
		        System.out.println("Enter input string to be cleaned from white spaces...!");
		         
		        String inputString = sc.nextLine();
		         
		        String stringWithoutSpaces = inputString.replaceAll(" ", "");
		         
		        System.out.println("Input String : "+inputString);
		         
		        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
		         
		        sc.close();
	    }
	   
	   static void useingArray() {
		   
		   Scanner sc = new Scanner(System.in);
	         
	        System.out.println("Enter input string to be cleaned from white spaces...!");
	         
	        String inputString = sc.nextLine();
	        
	        String[] split = inputString.split(" ");
	      
	        for (String string : split) {
	        	System.out.print(string);
				
			}
	        
		   }
	}
