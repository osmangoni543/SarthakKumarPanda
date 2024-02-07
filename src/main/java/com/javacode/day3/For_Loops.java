package com.javacode.day3;

public class For_Loops {

	public static void main(String[] args) {
		// for loops
		//1st step- initialization
		//2nd step- condition
		//3rd step- if the condition is true it will go inside the body of the for loop
		//3rd step- if the condition is false it will go outside the body of the for loop
		//4th step- it will execute the logic inside the for loop
		//5th step- it will update the value as per the increment or decrement operation
		//6th step- check the condition again
		//7th step- if the condition is true it will go inside the body of the for loop
		//7th step- if the condition is false it will go outside the body of the for loop
		
		for(int i = 1; i<=5; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("**********************************************************");
		
		// WAP to print 100 to 1 using for loop
		
		for(int j = 100; j>=1; j--) {
			System.out.print(j+" ");
		}
		
		System.out.println();
		System.out.println("**********************************************************");
		
		// WAP to print the sum of 100 to 1 using for loop
		// 100+99+98...........+1.
		
		int sum = 0;
		
		for(int k = 100; k>=1 ; k--) {
			System.out.print(k+" ");
			sum = sum + k;
			System.out.println(sum+" ");
			
		}
		
		System.out.println();
		System.out.println("**********************************************************");
		
		// Write a program to print from 500 to 0 in decrement of 25.
		
		for(int l = 500; l>=1; l-=25) {
			System.out.print(l+" ");
		}
		
		System.out.println();
		System.out.println("**********************************************************");
		
		// Write a program to print from 500 to 0 in decrement of 25.
		
		int s = 0;
		
		for (int m = 500; m>=0; m-=25) {
			System.out.print(m+" ");
			s = s+m;
			System.out.println(s);
		}
		
	}

}
