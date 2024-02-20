package com.ty.string;

import java.sql.DriverManager;

class Parent{
	String a="parent";
	
}
//class Child extends Parent{
//	String b="Child";
//	
//}

public class Driver extends Parent {
	String d="child";
	public static void main(String[] args) {
		
//		Parent p1 = new Child();	System.out.println(p1.b);
		
		Parent d1 = new Driver();
//	Driver p1 = (Driver) new Parent();
	
//	Driver p2= (Driver)p1;
		
	}

}
