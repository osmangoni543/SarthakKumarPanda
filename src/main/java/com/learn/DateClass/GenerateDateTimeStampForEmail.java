package com.learn.DateClass;

import java.util.Date;

public class GenerateDateTimeStampForEmail {

	public static void main(String[] args) {
		
		Date date = new Date();
		String timeStamp = date.toString().replace(" ","_").replace(":","_");
		System.out.println(timeStamp);
	}

}
