package com.automationcode.day7;

import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_Automation_Objects {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}
	
	

}
