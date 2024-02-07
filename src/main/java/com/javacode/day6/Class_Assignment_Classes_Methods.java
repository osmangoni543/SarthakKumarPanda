package com.javacode.day6;

public class Class_Assignment_Classes_Methods {
	
	//Create a class which has the main method.
	//Inside this class create public, private, protected, default, static and non-static method
	//Static methods will be called directly
	//Non static methods will be called by the help of Object reference
	//Make sure all the methods have a proper return type.
	
	//Create anothe class
	//In this class make 3 non-static and 2 static and dont create main method in this class.
	//Now call all these methods in the main method you created before.
	
	public static void main(String[] args) {
		
		tc1();
		tc2();
		tc3();
		tc4();
		
		Class_Assignment_Classes_Methods reference = new Class_Assignment_Classes_Methods();
		reference.tc5();
		
		New_CLass ref = new New_CLass();
		
		New_CLass.logic1();
		New_CLass.logic2();
		ref.logic3();
		ref.logic4();
		ref.logic5();
		
	}
	
	public static int tc1() {
		int i = 2; int j = 3;
		int k = i+j;
		System.out.println(k);
		return k;
		
	}
	private static String tc2() {
		String S1= "Hello";
		String S2= "World";
		String S3 = S1+S2;
		System.out.println(S3);
		return S3;		
				
	}
	protected static boolean tc3() {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = (b1!=b2);
		System.out.println(b3);
		return b3;
	
	}
	static void tc4() {
		System.out.println("This is a default static method");
	
	}
	public void tc5() {
		System.out.println("This is a non-static public method");
	
	}
	

}
