package com.javacode.day7;

public class Animal {
	
	String name;
	int no_of_legs;
	int age;

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal animal1 = new Animal();
		
		//animal is the reference.
		
		//Object is a collection of all the non-static entities of a class.
		
		animal.sleeping();
		animal.name = "Johnnie";
		animal.no_of_legs = 4;
		animal.age = 12;
		
		animal1.name = "Walker";
		animal1.no_of_legs = 4;
		animal1.age = 12;
		
		

	}
	
	public void sleeping() {
		
	}
	
	public void dogProfile(String name, int no_of_legs, int age){
		this.name = name;
		this.no_of_legs = no_of_legs;
		this.age = age;
	}
}
