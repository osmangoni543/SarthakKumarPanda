package com.javacode.day8.oopsPolymorphism_MethodOverriding;

public class Students extends School{
	
	public static void main(String[] args) {
		
		Students student = new Students();
		student.library();
		student.library("Hitachi");
		student.library("Bluestar", true);
		
		School school = new School();
		school.library();
		school.library("Conair");
		school.library("Samsung", true);
	}
	
	public void library() {
		System.out.println("Student's Library");
	}
		public void library(String AC) {
			System.out.println("Student's Library with AC");
	}
		public void library(String AC, boolean examResult) {
			System.out.println("Student's Library with AC and Exam center");
	}

}
