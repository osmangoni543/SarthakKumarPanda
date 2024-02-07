package com.javacode.day8.oopInheritance;

public class Students extends School{
	
	//Students becomes the child class or sub class
	//School becomes the parent class or super class

	public static void main(String[] args) {
		
		markSheet();
		Students.markSheet();
		
		Students students = new Students();
		
		students.subjectSelection();
		students.examAppearence();
		
		students.playground();
		students.library();
		
		School school = new School();
		school.playground();
		school.library();
		
		School.musical();
		

	}
	
	public void subjectSelection() {
		System.out.println("This is Student Subject selection.");
	}
	public void examAppearence() {
		System.out.println("This is Student Exam Appearance.");
	}
	public static void markSheet() {
		System.out.println("This is students Marksheet.");
	}

}
