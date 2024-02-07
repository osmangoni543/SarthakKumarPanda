package com.javacode.day3;

public class ForLoop_Inside_ForLoop {

	public static void main(String[] args) {
		// NESTED for loops.
		
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=5; j++) {
				System.out.print("Green ");
			}
			
			System.out.println("World");
		}

		System.out.println("--------------------------------------------------");
		
		// WAP to draw the following diagram/matrix.
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		
		for(int k = 1; k<=5; k++) {
			for(int l = 1; l<=5; l++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		System.out.println("--------------------------------------------------");
		
		// WAP to draw the following diagram/matrix.
		// * 
		// * * 
		// * * * 
		// * * * * 
		// * * * * *
		
		for(int m = 1; m<=5; m++) {
			for(int n = 1; n<=m; n++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		System.out.println("--------------------------------------------------");
		
		// WAP to draw the following diagram/matrix.
		// * * * * * 
		// * * * *
		// * * * 
		// * *  
		// * 		
		
		for(int o = 1; o<=5; o++) {
			for(int p = 5; p>=o; p--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		
		// WAP to draw the following diagram/matrix.
		// * 
		// * * 
		// * * * 
		// * * * * 
		// * * * * *
		// * * * *
		// * * * 
		// * *  
		// * 
		
		for(int m = 1; m<=5; m++) {
			for(int n = 1; n<=m; n++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for(int o = 1; o<=5; o++) {
			for(int p = 4; p>=o; p--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		
	}

}
