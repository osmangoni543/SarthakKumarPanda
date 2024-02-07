package com.javacode.day8.oopsPolymorphism_MethodOverriding;

public class Dog extends Animal{

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.Details();
		animal.Details("Dog","Chihuahua");
		animal.Details("Dog","Chihuahua", "Brown");
		animal.Details("Dog","Chihuahua", "Brown", 5);
		animal.Details("Dog","Chihuahua", "Brown", 5, 3);
		
	
		Animal dog = new Dog();
		dog.Details();
		dog.Details("Dog","Chihuahua");
		dog.Details("Dog","Chihuahua", "Brown");
		dog.Details("Dog","Chihuahua", "Brown", 5);
		dog.Details("Dog","Chihuahua", "Brown", 5, 3);

	}
	public void Details(){
		System.out.println("Dog");
	}
	public void Details(String t, String b){
		System.out.println(t +" "+b);
	}
	public void Details(String t, String b, String C){
		System.out.println(t +" "+b+" "+C);
	}
	public void Details(String t, String b, String C, int A){
		System.out.println(t +" "+b+" "+C+" "+A);
	}
	public void Details(String t, String b, String C, int A, int H){
		System.out.println(t +" "+b+" "+C+" "+A+" "+H);
	}


}
