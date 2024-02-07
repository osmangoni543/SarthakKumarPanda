package com.automation.TestNG.day4;

import org.testng.annotations.DataProvider;

public class DataProviders_Seperate {
	
	@DataProvider
	public Object[][] getTNData() {
		Object[][] data = {	{"seleniumpanda1@gmail.com","Selenium@123"},
			                	{"seleniumpanda2@gmail.com","Selenium@123"},
			                };
		return data;
	}
	@DataProvider
	public Object[][] getRData() {
		Object[][] data = {	{"seleniumpanda@rediffmail.com","Selenium@123"},
				                {"seleniumpanda1@rediffmail.com","Donkey@123"},
			                };
		return data;
	}


}
