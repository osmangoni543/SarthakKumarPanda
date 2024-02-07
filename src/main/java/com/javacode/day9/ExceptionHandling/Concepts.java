package com.javacode.day9.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Concepts {
	
	//There are two types of Exception in Java:
	//1. CompileTime exception [Checked Exception]
	//2. RunTime exception     [Unchecked Exception]
	
	//In summary, compile-time exceptions are errors detected by the compiler during the compilation phase due to 
	//syntax or semantic issues, while runtime exceptions are errors that occur during program execution and are 
	//typically related to logic or data issues that could not be caught by the compiler.

	public static void main(String[] args) {
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println(7/0); //this is an exception. Can't divide by zero.
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
	}

	public static void validatingCompileTimeException() {
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\osman\\Desktop\\TestCaseDocument.xslx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
