package com.javacode.day9.ExceptionHandling;

public class Part1_Throw {

	public static void main(String[] args) {
		
		int a=10, b=0, c;
		c = a/b;
		System.out.println(c);
		throw new ArithmeticException(); //MAnually handling the exception by User.
		
		//It is a good practice to not use pre defined keywords Exceptions with throw keyword
		//

	}

}
