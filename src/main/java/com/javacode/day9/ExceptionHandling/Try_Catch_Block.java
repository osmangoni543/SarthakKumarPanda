package com.javacode.day9.ExceptionHandling;

public class Try_Catch_Block {

	public static void main(String[] args) {
		
		validatingArithmaticExceptions();
		tryCodeIsNotRiskySoWhatHAppensToCatchBlock();
		nullPointerExceptionValidation();
		
	}
	
	public static void tryCatchSyntax() {
		
	}
	
	public static void validatingArithmaticExceptions() {
		int a = 10;
		int b= 0;
		try {
		int c = a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e) {   //or catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello World");
	}
	
	// Explaination - Exception occur at row number 13 for the method validatingArithmaticExceptions()
					//The method validatingArithmaticExceptions() will try to create an object
					//Since it is not being able to handle the exception it is passing the object to compiler.
					//Is compiler able to handle this exception?
	                //Answer - No.
	
					//Compiler will transfer this Exception Object to Default Exception Handler
	
					//What will DEH do?
					//It will print the exception.
					//ExceptionName - Arithmatic Exception
					//Description - /by zero
					//Stacktrace - It gives you the whole are where the exception is occurring.
	//Exception in thread "main" java.lang.ArithmeticException: / by zero
	//at com.javacode.day9.ExceptionHandling.Try_Catch_Block.validatingArithmaticExceptions(Try_Catch_Block.java:13)
	//at com.javacode.day9.ExceptionHandling.Try_Catch_Block.main(Try_Catch_Block.java:7)

	
	public static void tryCodeIsNotRiskySoWhatHAppensToCatchBlock() {
		int a = 10;
		int b= 2;
		try {
			int c = a/b;
			System.out.println(c);
			System.out.println("I am inside the try block without any risky code");
		} catch (Exception e) {
			System.out.println("I am inside the catch block"); // This will be ignored as the try block isnt risky
			e.printStackTrace();
		}
		}
	public static void nullPointerExceptionValidation() {
		String name = null;
		System.out.println(name.length());
	}
}
