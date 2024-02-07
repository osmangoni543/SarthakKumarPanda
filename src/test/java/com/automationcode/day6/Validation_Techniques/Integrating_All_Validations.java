package com.automationcode.day6.Validation_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Integrating_All_Validations {
	
	// WebPage Validation
	// Web Element Validation
	// Warning Message Validation if any specially for negative testing. 

	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		rediffPositive();
		rediffNegative();

	}
	
	/////////////////////////////////////////////////////////////////////////
	
	public static void rediffPositive() throws Exception {
		driver.get("https://rediff.com");
		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
		String actualTitle = driver.getTitle();
		String actualCurrentUrl = driver.getCurrentUrl();
		
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String expectedCurrentUrl = "https://www.rediff.com/";
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			driver.findElement(By.cssSelector("a.signin")).click();
		}
		else {
			System.out.println("Either the Title or Url is incorrect.");
		}
		
		WebElement usernameTextbox = driver.findElement(By.cssSelector("input#login1"));
		WebElement passwordTextbox = driver.findElement(By.cssSelector("input#password"));
		WebElement signinButton = driver.findElement(By.cssSelector("input.signinbtn"));
		
		if(usernameTextbox.isEnabled() && passwordTextbox.isEnabled() && signinButton.isDisplayed()) {
			usernameTextbox.sendKeys("seleniumpanda@rediffmail.com");
			passwordTextbox.sendKeys("Selenium@123");
			signinButton.click();
		}
		else {
			System.out.println("Web Elements are not Visible or Enabled.");
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a.rd_logout"));
		Thread.sleep(2000);
		driver.get("https://rediffmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("p#signin_info > a")).click();
		Thread.sleep(2000);
		driver.get("https://rediffmail.com");
		Thread.sleep(2000);
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	
	public static void rediffNegative() throws Exception{
    driver.get("https://rediff.com");
		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
		String actualTitle = driver.getTitle();
		String actualCurrentUrl = driver.getCurrentUrl();
		
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String expectedCurrentUrl = "https://www.rediff.com/";
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			driver.findElement(By.cssSelector("a.signin")).click();
		}
		else {
			System.out.println("Either the Title or Url is incorrect.");
		}
		
		WebElement usernameTextbox = driver.findElement(By.cssSelector("input#login1"));
		WebElement passwordTextbox = driver.findElement(By.cssSelector("input#password"));
		WebElement signinButton = driver.findElement(By.cssSelector("input.signinbtn"));
		
		if(usernameTextbox.isEnabled() && passwordTextbox.isEnabled() && signinButton.isDisplayed()) {
			usernameTextbox.sendKeys("seleniumpanda@rediffmail.com");
			passwordTextbox.sendKeys("Selenium@123456");
			signinButton.click();
		}
		else {
			System.out.println("Web Elements are not Visible or Enabled.");
		}
		
		//Wrong username and password combination.
		
		String actualWarningMessage = driver.findElement(By.cssSelector("div#div_login_error > b")).getText();
		String expectedWarningMessage = "Wrong username and password combination.";
		
		if(actualWarningMessage.contains(expectedWarningMessage)) {
			System.out.println("Warning Message is correct.");
		}
		
	}

}
