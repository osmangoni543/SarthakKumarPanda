package com.javacode.day8.oopsPolymorphism_MethodOverloading;

public class Automatic_Promotions {

	public static void main(String[] args) {
		Automatic_Promotions ref = new Automatic_Promotions();
		
		ref.display(3);
		ref.display("Hello");
		ref.display('C'); // Gets promoted to char datatype
		
	}
	
	public void display(int i) {
		System.out.println("This is int method");
		
	}
	
	public String display(String S) {
		System.out.println("This is String method");
		return S;
	}
	
}


