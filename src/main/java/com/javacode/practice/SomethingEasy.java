package com.javacode.practice;

import java.util.Scanner;

public class SomethingEasy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first numer: ");
		int a = scan.nextInt();
		
		System.out.println("Enter your second numer: ");
		int b = scan.nextInt();
		
		int c = a+b;
		System.out.print("The addition of the two numbers is " + c);

	}

}
