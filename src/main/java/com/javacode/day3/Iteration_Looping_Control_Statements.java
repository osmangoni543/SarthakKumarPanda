package com.javacode.day3;

public class Iteration_Looping_Control_Statements {

	public static void main(String[] args) {
		// while loop
		// while loop is a control flow statement which is used when the boolean condition needs lot of repetition
		// while loop is also known as repeating if statement
		// if the number of iteration is not fixed, it is recommended to use while loop.
		
		//initialization
		//condition
		//increment or decrement or upgradation or degradation
		
		int i = 1;
		while (i<=10){
			System.out.print(i+" ");
			break;
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		//WAP to print first 10 natural numbers using while loop.
		
		int j = 1;
		while (j<=10) {
			System.out.print(j+" ");
			j++;
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		// WAP to print first 20 whole numbers.
		
		int k = 0;
		while(k<=19) {
			System.out.print(k+"");
			k++;
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		// WAP to print first 25 even numbers.
		
		int l = 2;
		int count = 1;
		while(count<=25) {
			System.out.print(l + " ");
			l+=2;
			count++;
		}
		
		System.out.println();
		System.out.println("***************************************************");
		
		// WAP to print 20 numbers in reverse order in decrement of 5 starting from 100
		
		int m = 100;
		count = 1;
		
		while(count<=20) {
			System.out.print(m + " ");
			m-=5;
			count++;
		}
	}
	
	
}
