package com.ty.map;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Check {
	String name;
	static int id;
	
	Check(String name)
	{
		this.name=name;
	}
	Check(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	Check(){
		
	}
public static void main(String[] args) {
//	int arr[]=new int[5];
//	arr[0]=5;
//	arr[1]=5;
//	arr[0]=5;
//	arr[0]=5;
//	System.out.println(arr);
	
//	int [] names= new int[3];	
//	names[0]=new Integer(0);
//	System.out.println(names[0]);
	
//	int a[]= new int[5];
//	a[0]=101;
//	a[1]=1011;
//	a[2]=108;
//	a[3]=105;
//	a[4]=150;
	
//	int[] copyOf = Arrays.copyOf(a, 3);
//	System.out.println(copyOf[2]);
	
//	System.arraycopy(a, 0, names, 0, 3);
//	System.out.println(Arrays.toString(names ));
	Check check = new Check();
	Check check1 = new Check("name");
	
	

	
	
}}
