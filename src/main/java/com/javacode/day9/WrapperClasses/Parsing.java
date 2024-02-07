package com.javacode.day9.WrapperClasses;

public class Parsing {

	public static void main(String[] args) {

		StringToInteger();
		StringToDouble();
	}
	
	public static void StringToInteger() {
		String price1 = "450";
		String price2 = "150";
		
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		int sum = p1+p2;
		
		System.out.println(sum);
		
	}
	
	public static void StringToDouble() {
		String price1 = "128.52";
		String price2 = "576.98";
		
		double d1 = Double.parseDouble(price1);
		double d2 = Double.parseDouble(price2);
		double sum = d1+d2;
		
		System.out.println(sum);
	}

}
