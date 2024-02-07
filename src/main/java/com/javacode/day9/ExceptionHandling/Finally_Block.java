package com.javacode.day9.ExceptionHandling;

public class Finally_Block {

	public static void main(String[] args) {
		int a=0, b=0, c;
		try {
			c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			System.out.println("This will print no matter what is happening in try catch block");
		}

	}

}
