package com.javacode.day9.ScannerClass;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scan.next();
		
		System.out.println("Enter your Gender(M/F): ");
		char gender = scan.next().charAt(0);
		
		System.out.println("Enter your Age: ");
		int age = scan.nextInt();
		
		System.out.println("Enter your Phone Number: ");
		long phone = scan.nextLong();
		
		System.out.println("Name:" + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Phone: " + phone);

	}

}
