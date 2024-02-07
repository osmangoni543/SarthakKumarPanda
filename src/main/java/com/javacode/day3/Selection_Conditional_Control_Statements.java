package com.javacode.day3;

public class Selection_Conditional_Control_Statements {

	public static void main(String[] args) {
		// if
		//Syntax:
		
		//if(condition)
		//{
		//};
		
		
		if(2<3) {
			System.out.println("I am learning If Syntax.");
			
			
		if(2>3) {
			System.out.println("The condition is correct.");
		}else {
			System.out.println("The condition is incorrect.");
		}	
		
		//if else if
		
		//We learn with a programming concept
		
		//Find the largest of 3 numbers
		int i= 10, j= 20, k= 30;
		if(i>j && i>k) {
			System.out.println("i is the greatest" + i);
		}
		else if(j>i && j>k) {
				System.out.println("j is the greatest" + j);
		}
		else {
				System.out.println("k is the greatest" + k);
		}
		
		//WAP to determine smallest of 5 numbers
		
		int f = 7;
		int g = 9;
		int h = 4;
		int l = 8;
		int m = 5;
		if(f<g && f<h && f<l && f<m) {
			System.out.println("f is the smallest "+f);
			}
		else if(g<f && g<h && g<l && g<m) {
			System.out.println("f is the smallest "+g);
			}
		else if(h<g && h<f && h<l && h<m) {
			System.out.println("f is the smallest "+h);
			}
		else if(l<g && l<h && l<f && l<m) {
			System.out.println("f is the smallest "+l);
			}
			else {
			System.out.println("f is the smallest "+f);
		}
		
		
		//WAP to determine odd or even number
		
		int a = 2;
		int b = 3;
		int c = 9;
		int d = 12;
		
		if(a%2==0) 
		{
			System.out.println("a is an even number :"+a);
		}
		else  
		{
			System.out.println("a is an odd number :"+a);
		}
		if(b%2==0) 
		{
			System.out.println("b is an even number :"+b);
		}
		else  
		{
			System.out.println("b is an odd number :"+b);
		}
		if(c%2==0) 
		{
			System.out.println("c is an even number :"+c);
		}
		else  
		{
			System.out.println("c is an odd number :"+c);
		}
		if(d%2==0) 
		{
			System.out.println("d is an even number :"+d);
		}
		else 
		{
			System.out.println("d is an odd number :"+d);
		}
	
		//WAP to determine which is a leap year.
		
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
		}
		
		//WAP to determine a given day.
		
		String day = "Pineapple";
		
		switch(day) {
		case "Sunday" : System.out.println("It is Sunday");
		break;
		case "Monday" : System.out.println("It is Monday");
		break;
		case "Tuesday" : System.out.println("It is Tuesday");
		break;
		case "Wednesday" : System.out.println("It is Wednesday");
		break;
		case "Thursday" : System.out.println("It is Thursday");
		break;
		case "Friday" : System.out.println("It is Friday");
		break;
		case "Saturday" : System.out.println("It is Saturday");
		break;
		default : System.out.println("Mismatch");
		}
		
}
}

