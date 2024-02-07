package com.javacode.day7;

public class Student_Con {
	
	String name;//default value - null
	String subject;//default value - null
	int student_id;//default value - 0

	public static void main(String[] args) {
		
		//Constructors are invoked the moment an Object is created
		
		Student_Con student1 = new Student_Con("Tom","Java",101);//default constructor which is not visible
		Student_Con student2 = new Student_Con("Harry","Python",102);
		
		System.out.println(student1.name+" "+student1.subject+" "+student1.student_id);
		System.out.println(student2.name+" "+student2.subject+" "+student2.student_id);

	}
	
//	public Student_Con() { //No arguments User defined constructor.
//	}
		
	public Student_Con(String name, String subject, int student_id){  //With arguments User defined constructor 
		this.name = name;
		this.subject = subject;
		this.student_id = student_id;
	}
	
	public void loginTest() {
		
	}

}  
