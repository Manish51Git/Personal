package com.ty.spring8;

public class Test {
	public static void main(String[] args) {
//		 LambdaExpression lambdaExpression=()->{
//				System.out.println("SwitchOn"); 
//			 };
//		LambdaExpression lambdaExpression=()->System.out.println("switch on without body!");
//		
//			 lambdaExpression.switchOn();
		
		
		//------------------------------------------------
//		LambdaExpression lambdaExpression=(input)-> System.out.println("input : "+input);
//		
//		lambdaExpression.m1(10);
		//----------------------------------------------------------
		
		LambdaExpression lambdaExpression=(i1,i2)->{
			return i1+i2;
		};
		System.out.println("Sum : "+ lambdaExpression.sum(10,20));
		
	}

}


//()    ->    {body};