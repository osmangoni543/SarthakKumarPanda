package com.javacode.practice;

public class Assigments {
	
//	Program 1: Program to check for leap year in java
//	Program 2: Program to swap two numbers with and without using the 3rd variable
//	Program 3: Program to find Factorial of a number
//	Program 4: Program to find Factorial of a number using recursion
//	Program 5: Program to reverse a number
//	Program 6: Program to check whether a number is palindrome or not
//	Program 7: Program to print all prime numbers between 1 and 100
//	Program 8: Program to find Fibonacci series
//	Program 9: Program to check Armstrong number
	
	public static int e = 10;
	public static int fact = 1;

	public static void main(String[] args) {
		
//		Program 1: Program to check for leap year in java
		
		int year1 = 1996; 
		int year2 = 1900; 
		int year3 = 2000;
		
		if(year1%4==0 && (year1%100!=0 || year1%400==0)) {
			System.out.println("Year "+year1+" is a leap year.");
		}
		else {
			System.out.println("Year "+year1+" is not a leap year");
		}
		if(year2%4==0 && (year2%100!=0 || year2%400==0)) {
			System.out.println("Year "+year2+" is a leap year.");
		}
		else {
			System.out.println("Year "+year2+" is not a leap year");	
		}
		
		if(year3%4==0 && (year3%100!=0 || year3%400==0)) {
			System.out.println("Year "+year3+" is a leap year.");
		}
		else {
			System.out.println("Year "+year3+" is not a leap year");	
		}
		
		System.out.println("****************************************************************");
		
//		Program 2: Program to swap two numbers with and without using the 3rd variable
		
		int a = 5; 
		int b = 10;
		
		a = a+b; //a=15, b=10
		b = a-b; //a=15, b=5
		a = a-b; //a=10, b=5
		
		System.out.println("The value of a is: "+a+" The value of be is: "+b);
		
		System.out.println("****************************************************************");
		
//		Program 3: Program to find Factorial of a number
		
		int c = 20;
		int factorial = 1;
		
		for(int d = c; d>=1; d--) {
			factorial = factorial * d;
		}
		System.out.println("The factorial of "+c+" is: "+factorial);
		System.out.println("****************************************************************");
		
//		Program 4: Program to find Factorial of a number using recursion
		
		factorial();

	}
	
	public static void factorial() {
		if(e<0) {
			System.out.println("Enter a positive number.");
		}
		else if(e==0) {
			System.out.println("The factorial of 0 is 1.");
		}
		else {
			for(int f = e; f>=1; f--) {
				fact = fact * f;
			}
			System.out.println("The factorial using recursion is: "+ fact);
		}
	}

}
