package com.javacode.day9.ScannerClass;

import java.util.Scanner;



public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first numer: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the first numer: ");
		int num2 = scan.nextInt();
		System.out.println("Enter the Arithmetic operator(+ - / *): ");
		char operator = scan.next().charAt(0);
		
		switch(operator) {
		case '+' : System.out.println("The addition is: " + (num1+num2));
		break;
		case '-' : System.out.println("The substraction is: " + (num1-num2));
		break;
		case '/' : System.out.println("The division is: " + (num1/num2));
		break;
		case '*' : System.out.println("The multiplication is: " + (num1*num2));
		break;
		default: System.out.println("Invalid operator!");
		}
		
		scan.close();
	}

}
