package com.practice.day;

public class Home_Practice_Java {

	public static void main(String[] args) {
		
		for(int i = 1; i<=5; i++) {
			System.out.print(i+"");
		}
		System.out.println();
		System.out.println("******************************************************");
		
		
		for(int i=100; i>=1; i-=5) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("******************************************************");
		
		for (int i = 1; i<=5; i++) {
			for(int j = 5; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("******************************************************");
		
		int i = 100;
		int count = 1;
		while(count<=20) {
			System.out.print(i+" ");
			i-=5;
			count = count +1;
		}
		
		System.out.println();
		System.out.println("******************************************************");
		
		String day = "Sunday";
		switch(day) {
		case "Sunday" : System.out.println("It is right");
		break;
		}
		
		int[][] a = {{1, 2, 3, 4},
				     {5, 6, 7, 8},
				     {9,10,11,12},
				     {13,14,15,16}};
		
		System.out.println(a.length);
		
		for(int k = 0; k<a.length; k++){
			for(int l = 0; l<a[k].length; l++) {
				System.out.print(a[k][l]+ " ");
			}
			System.out.println();
		}		
	}
	
	

}
