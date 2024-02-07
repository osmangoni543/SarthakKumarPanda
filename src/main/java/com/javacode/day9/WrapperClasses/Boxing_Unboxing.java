 package com.javacode.day9.WrapperClasses;

public class Boxing_Unboxing {
	
	//Character and Boolean wrapper classes - Immediate parent Class is Object
	//Integer, Byte, Short, Long, Double, Float wrapper classes - Immediate parent Class is Number
	
	//Boxing - conversion of primitive data type to wrapper class object.
	//Unboxing - conversion of wrapper class object to primitive data type.
	

	public static void main(String[] args) {
		boxingConcept();
		autoBoxingConcept();
		unboxingConcept();
		autoUnboxingConcept();
	}
	
	public static void boxingConcept() {
		int a = 10;
		Integer b = Integer.valueOf(a);
		System.out.println("The converted value of int data type to wrapper class object is: " + b);
	}
	
	public static void autoBoxingConcept() {
		int a = 10;
		int b =a;
		System.out.println("The converted value of int data type to wrapper class object is: " + b);
	}
	
	public static void unboxingConcept() {
		Integer result = 200;
		int newResult = result.intValue();
		System.out.println("The converted wrapper class object to primitive data type using unboxing  is: "+ newResult);
	}
	
	public static void autoUnboxingConcept() {
		Integer result = 300;
		int newResult = result;
		System.out.println("The converted wrapper class object to primitive data type using unboxing  is: "+ newResult);
	}
	

}
