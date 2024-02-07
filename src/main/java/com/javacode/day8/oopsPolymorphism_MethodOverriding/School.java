package com.javacode.day8.oopsPolymorphism_MethodOverriding;

public class School {
	
	public void library() {
		System.out.println("School's Library");
	}
		public void library(String AC) {
			System.out.println("School's Library with AC");
	}
		public void library(String AC, boolean examResult) {
			System.out.println("School's Library with AC and Exam center");
	}
	

}
