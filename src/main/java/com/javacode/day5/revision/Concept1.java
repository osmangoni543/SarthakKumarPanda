package com.javacode.day5.revision;

public class Concept1 {
	
	// What is a method in java?
	// Methods are independent units of excecution.
	// They will have definitive logic inside of it which under certain conditions will be used.
	// You can interchange the positions of the keywords public and static but not void.
	// Why is main method always static?
	// Any method can call any method but if necessary.
	// A private method can be used only with that specific class.

	public static void main(String[] args) { // You can also write (String... args)/(String args[])/(String[]args)/(String[] abc$#123)
		
		System.out.println("This is the main method");
		
		addition();
		substraction();
		main(); // it is acting as another regular method named as main but it is not the actual main method.

	}
	
	public static void main() {
		int m = 5; 
		int n = 6;	
		System.out.println(m * n);
	}
	
	public static void addition() {
		int i = 5; 
		int j = 6;	
		System.out.println(i + j);
	}
	
	public static void substraction() {
		int k = 10; 
		int l = 6;	
		System.out.println(k - l);
	}

}
