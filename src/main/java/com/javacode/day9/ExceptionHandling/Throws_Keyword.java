package com.javacode.day9.ExceptionHandling;

import java.io.FileInputStream;

public class Throws_Keyword {
	
	public static void main(String[] args) {
		validateWrongLogic();
		try {
			fileNotFoundException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void validateWrongLogic(){
		int a=10,b=0;
		try {
			int c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void fileNotFoundException() throws Exception {
		FileInputStream ip = new FileInputStream("Desktop//abx.txt");
	}
}
