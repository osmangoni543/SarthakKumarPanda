package com.javacode.day8.oopsPolymorphism_MethodOverloading;

public class Student {
	
	public static void main(String[] args) {
		
		// Can I overload the main method - Yes
		main(10);
		main(args = new String[3], args = new String[4]);
		main("Hello");
	}
	
	public static void main(int i) {
		System.out.println("This is an Overloaded main method with one int datatype parameter.");
	}
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("This is main method with two String array parameters.");
	}
	public static void main(String S1) {
		System.out.println("This is main method with one String datatype parameters.");
	}
	
	public void addition() {
		
	}
	
	// we have to overload this method addition
	
	public void addition(int i) {
		System.out.println("This is an Overloaded method with one int datatype parameter.");
	}
		
		public void addition(int j, int k, String S1) {
			System.out.println("This is an Overloaded method with two int datatype parameters.");
	}
		public void addition(int j, String S1, int k) {
			System.out.println("This is an Overloaded method with two int datatype parameters but Different Order.");
	}
		public void addition(String S2) {
			
		}
		public void addition(String S3, String S1) {
			
		}

}
