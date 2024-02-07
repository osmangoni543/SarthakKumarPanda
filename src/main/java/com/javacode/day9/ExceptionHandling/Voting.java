package com.javacode.day9.ExceptionHandling;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = scan.nextInt();
		try {
			if(age<18) {
				throw new People("Not eligible for voting");
			} else {
				System.out.println("Eligible for voting.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello Voting World");
		
		scan.close();
	}

}
