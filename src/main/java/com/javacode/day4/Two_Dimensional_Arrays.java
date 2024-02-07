package com.javacode.day4;

public class Two_Dimensional_Arrays {

	// [][]
	
	public static void main(String[] args) {

		//1. Declaration of Array
		/*
		int[][] a;
		int a1[][];
		int [][]a2;
		int[]a3[];
		int[][]a4;
		
		int[][] b,c; //b and c are both 2-D arrays
		int[] b1, c1; //b1 is 2-D, c1 is 1-D
		int[] b2[], c2[]; //b2 and c2 are both 2-D  
		//int[][]b3, []c3; law of arrays in java - 2nd variable cannot have a dimension before it. Only after is allowed
		int[][]b3, c3[]; // b3 is 2-D, c3 is 3-D
		*/
		
		//2. Create an Array
		
		//a = new int[3][4];
		
		//3. Initialize an Array
		/*
		a[0][0] = 1;a[0][1] = 2;a[0][2] = 3;a[0][3] = 4;
		
		a[1][0] = 5;a[1][1] = 6;a[1][2] = 7;a[1][3] = 8;
		
		a[2][0] = 9;a[2][1] = 10;a[2][2] = 11;a[2][3] = 12;
		*/
		
		int[][] a = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		
		//System.out.println(a.length);// Number of rows is the length of an array
		
		//4. Retrieve the elements of Array
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
