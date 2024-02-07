package com.javacode.day8.oopsPolymorphism_MethodOverriding;

public class Overloading_Vs_Overriding {

	public static void main(String[] args) {
		// poly means many
		// morph means form
		
		// In Java there are two types of polymorphism
		// 1.CompileTime/ Static polymorphism
			// It is achieved by Method Overloading
				//Method name should be the same
				//Class name should be the same
				//Different arguments or parameters
		// Interview Questions
		// Can we overload the main method? Yes
		// Can we achieve overloading if we change return type of methods? NO

		//2. Run Time Polymorphism / Dynamic Polymorphism
		
		// How to achieve this?
		// Method overriding
				// Method name should be the same
				// Class should be different 
				// Arguments will be the same
				// Inheritance should be there (is - a) relationship
		
		// Interview question
		// Access modifier of over-ridden method of of the child class should be
		// equivalent or higher than the method of the parent class


	}

}
