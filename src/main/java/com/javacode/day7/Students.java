package com.javacode.day7;

public class Students {
	
	String name;
	int student_id;
	int year_of_experience;

	public static void main(String[] args) {
		
		Students student1 = new Students();
		Students student2 = new Students();
		Students student3 = new Students();
		
		student1.name = "David";
		student1.student_id = 001;
		student1.year_of_experience = 1;
		
		student2.name = "John";
		student2.student_id = 002;
		student2.year_of_experience = 4;
		
		student3.name = "Kevin";
		student3.student_id = 003;
		student3.year_of_experience = 2;
		
		System.out.println(student1.name+student1.student_id+student1.year_of_experience);

	}

}
