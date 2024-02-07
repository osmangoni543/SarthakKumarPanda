package com.javacode.day6;

public class Concepts_Of_Methods {
	
	// Methods are independent units of execution.
	// If the method is static then it can call itself directly in the main method.
	// If the method is static then it can be called using Class name.
	

	public static void main(String[] args) {
		// This is the main method.
		
		addition();
		stringJoining();
		logic();
		test();
		
		Concepts_Of_Methods.addition();
		Concepts_Of_Methods.stringJoining();
		Concepts_Of_Methods.logic();
		Concepts_Of_Methods.test();
		
		Methods_In_SeperateClass.testCase1();
		Methods_In_SeperateClass.testCase2();
		
		//For a non-static method, First you have to create an object of the class.
		//Then with the help of reference of the object you can call the non-static entities.
		//How to create objects:
		//1. new keyword
		//2. newInstance() method
		//3. clone() method
 		//4. deserialization
		//5. factory methods
		
		Concepts_Of_Methods reference = new Concepts_Of_Methods();
		reference.loginTest();
		
		Methods_In_SeperateClass reference1 = new Methods_In_SeperateClass();
		reference1.testCase3();
		
		

	}
	public static int addition() {
		int i = 10;
		int j = 20;
		int sum = i + j;
		System.out.println(sum);
		return sum;
	}
	private static String stringJoining() {
		String S1 = "Hello";
		String S2 = "World";
		String S3 = S1 + S2;
		System.out.println(S3);
		return S3;
	}
	protected static void logic() {
		
	}
	static void test() {
		
	}
	public void loginTest() {
		
	}

}
