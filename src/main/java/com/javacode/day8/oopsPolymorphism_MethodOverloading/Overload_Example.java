package com.javacode.day8.oopsPolymorphism_MethodOverloading;

public class Overload_Example {
	

	    // Non-static method with no parameters
	    public void printInfo() {
	        System.out.println("No information provided.");
	    }

	    // Overload 1: Accepts an integer
	    public void printInfo(int num) {
	        System.out.println("Received integer: " + num);
	    }

	    // Overload 2: Accepts a double
	    public void printInfo(double num) {
	        System.out.println("Received double: " + num);
	    }

	    // Overload 3: Accepts a string
	    public void printInfo(String text) {
	        System.out.println("Received string: " + text);
	    }

	    // Overload 4: Accepts two integers
	    public void printInfo(int num1, int num2) {
	        System.out.println("Received integers: " + num1 + " and " + num2);
	    }

	    // Overload 5: Accepts a boolean and a string
	    public void printInfo(boolean flag, String text) {
	        System.out.println("Received boolean: " + flag + " and string: " + text);
	    }

	    public static void main(String[] args) {
	        Overload_Example example = new Overload_Example();

	        example.printInfo();
	        example.printInfo(42);
	        example.printInfo(3.14);
	        example.printInfo("Hello, overloading!");
	        example.printInfo(10, 20);
	        example.printInfo(true, "Overloaded methods are cool!");
	    }	

}
