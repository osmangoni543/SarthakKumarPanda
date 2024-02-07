package com.javacode.day4;

public class ForEach_Loop {

	public static void main(String[] args) {
		
		//for each = traversing technique to iterate through the elements in an array/collection
		//less steps, more readable
		//less flexible
		
		String[] animals = {"Cat", "Dog", "Rat", "Bird"};
		
		//Retrieving using for loop:
		System.out.println("Retrieving using for loop:");
		 for(int i=0; i<animals.length; i++) {
			 System.out.print(animals[i] + " ");
		 }
		 System.out.println();
		 
		 //Retrieving using for loop:
		System.out.println("Retrieving using for each loop:");
		 for(String i : animals) {
			 System.out.print(i + " ");
		}
		System.out.println();
		

	}

}
