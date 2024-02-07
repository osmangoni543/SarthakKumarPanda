package com.practice.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Validation_WarningMessages {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//span[@class = 'hidden-xs hidden-sm hidden-md' and contains(text(), 'My Account')]")).click();
		driver .findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li:nth-child(1) > a")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}	
	
	@Test
	public void registerTestCSS()
	{	
		String PpWactualWarningMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		String PpWxpectedWarningMessage = "Warning: You must agree to the Privacy Policy!";
		if(PpWactualWarningMessage.contains(PpWxpectedWarningMessage)) {
			System.out.println("The Privacy Policy warning message is correct.");
		} else {
			System.out.println("The warning message is incorrect.");
		}
		
		String actualfnWM = driver.findElement(By.xpath("//div[contains(text(), 'First Name must be between 1 and 32 characters!' )]")).getText();
		String expectedfnWM = "First Name must be between 1 and 32 characters!";
		if(actualfnWM.contains(expectedfnWM)) {
			System.out.println("The First Name warning message is correct.");
		} else {
			System.out.println("The First Name warning message is incorrect.");
		}

		
		String actuallnWM = driver.findElement(By.xpath("//div[contains(text(), 'Last Name must be between 1 and 32 characters!' )]")).getText();
		String expectedlnWM = "Last Name must be between 1 and 32 characters!";
		if(actuallnWM.contains(expectedlnWM)) {
			System.out.println("The Last Name warning message is correct.");
		} else {
			System.out.println("The Last Name warning message is incorrect.");
		}
		
		String actualEmailWM = driver.findElement(By.xpath("//div[contains(text(), 'E-Mail Address does not appear to be valid!' )]")).getText();
		String expectedEmailWM = "E-Mail Address does not appear to be valid!";
		if(actualEmailWM.contains(expectedEmailWM)) {
			System.out.println("The Email warning message is correct.");
		} else {
			System.out.println("The Email warning message is incorrect.");
		}
		
		String actualTWM = driver.findElement(By.xpath("//div[contains(text(), 'Telephone must be between 3 and 32 characters!' )]")).getText();
		String expectedTWM = "Telephone must be between 3 and 32 characters!";
		if(actualTWM.contains(expectedTWM)) {
			System.out.println("The Telephone warning message is correct.");
		} else {
			System.out.println("The Telephone Name warning message is incorrect.");
		}
		
		String actualPWM = driver.findElement(By.xpath("//div[contains(text(), 'Password must be between 4 and 20 characters!' )]")).getText();
		String expectedPWM = "Password must be between 4 and 20 characters!";
		if(actualPWM.contains(expectedPWM)){
			System.out.println("The password warning message is correct");
		}
		else{	
			System.out.println("The password warning message is in correct");
		}		
	}
	
	
	@AfterMethod
	public void teardown() throws Exception {
		driver.quit();
	}
	


}
