package com.automation.TestNG.day6.ApplyingDataDriven_this_super_Keywords;

import java.util.Date;

public class Utilities {
	
	//Customize your email so that you dont have to worry about duplicacy
	
	public static String generateEmailWithTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ","_").replace(":","_");
		return "selemiunpanda"+timeStamp+"@gmail.com";
	}
}
