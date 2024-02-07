package com.javacode.day8.oopsPolymorphism_MethodOverriding;

public class Animal {
	
	public void Details(){
		System.out.println("Animal name");
	}
	public void Details(String t, String b){
		System.out.println("Animal Breed");
	}
	public void Details(String t, String b, String C){
		System.out.println("Animal Breed Color");
	}
	public void Details(String t, String b, String C, int A){
		System.out.println("Animal Breed Color Age");
	}
	public void Details(String t, String b, String C, int A, int H){
		System.out.println("Animal Breed Color Age Height");
	}

}
