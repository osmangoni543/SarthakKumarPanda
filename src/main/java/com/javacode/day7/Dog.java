package com.javacode.day7;

public class Dog {
	
	String name;
	String color;
	int age;

	public static void main(String[] args) {
		
		Dog labrador = new Dog();
		labrador.intializeLabProfile("Romeo", "Fawn", 5);
		labrador.displayLabProfile();

	}
	
	public void intializeLabProfile(String n,String c, int a) {		
		name = n;
		color = c;
		age = a;		
	}
	public void displayLabProfile() {
		System.out.println(name+" "+color+" "+age);
	}

}
