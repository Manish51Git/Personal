package com.ty.array;

class E{
	static int c;
	public static String m1() {
		return "hello";
	}
	static {
		m1();
		System.out.println("static block"+c);
		m1();
	}
	{
		System.out.println("non static block");
	}
}



public class D {
	public static void main(String[] args) throws ClassNotFoundException {
		
		//E e = new E();
		Class.forName("com.ty.array.E");
	}

	
}
