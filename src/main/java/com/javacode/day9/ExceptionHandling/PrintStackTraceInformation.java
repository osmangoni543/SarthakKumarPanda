package com.javacode.day9.ExceptionHandling;

public class PrintStackTraceInformation {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		try {
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();  // Generally we use this which will print everything.
			System.out.println(e);  // This will print the name and description of the Exception but NOT stacktrace.
			System.out.println(e.toString());  // This will print the name and description of the Exception but NOT stacktrace.
			System.out.println(e.getMessage()); // This will only print description.
		}

	}

}
