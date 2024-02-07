package com.practice.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Home_Practice_Automation {
	public WebDriver driver;
	public Select select;
	@BeforeMethod
	public void setup() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		
		}
	
	@Test(priority = 1)
	public void tc1() throws Exception {
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String actualTitle = driver.getTitle();
		String actualCurrentUrl = driver.getCurrentUrl();
		
		String expectedTitle = "Facebook - log in or sign up";
		String expectedCurrentUrl = "https://www.facebook.com/";
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		}
	
		}
	
	@Test(priority = 2)
	public void tc2() throws Exception {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String actualTitle = driver.getTitle();
		String actualCurrentUrl = driver.getCurrentUrl();
		
		String expectedTitle = "Facebook - log in or sign up";
		String expectedCurrentUrl = "https://www.facebook.com/";
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		WebElement firstNameTextbox = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		if (firstNameTextbox.isEnabled()) {
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Doe");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("johndoe123@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("johndoe123@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Selenium@123");
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("May");
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("9");
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1997");
		driver.findElement(By.xpath("//input[@name='sex'][@value='2']")).click();		
		driver.findElement(By.xpath("//button[@name = 'websubmit']")).click();
	}
	}
	}
	
	@Test(priority=3)
		public void tc3() throws Exception {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String actualTitle = driver.getTitle();
		String actualCurrentUrl = driver.getCurrentUrl();
		
		String expectedTitle = "Facebook - log in or sign up";
		String expectedCurrentUrl = "https://www.facebook.com/";
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		WebElement firstNameTextbox = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		if (firstNameTextbox.isEnabled()) {
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Doe");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("johndoe123@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("johndoe123@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Selenium@123");
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("May");
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("9");
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1997");
		driver.findElement(By.xpath("//input[@name='sex'][@value='2']")).click();		
		driver.findElement(By.xpath("//button[@name = 'websubmit']")).click();
		Thread.sleep(30000);
		
		String actualWarningMessage = driver.findElement(By.cssSelector("div._58mo")).getText();
		String expectedWarningMessage = "We require everyone to use the name they use in everyday life, what their friends call them, on Facebook.";
		
		if (actualWarningMessage.contains(expectedWarningMessage)) {
			System.out.println("The warning message is correct");
		}
		else {
			System.out.println("The warning message in incorrect.");
		}
	}
	}	
		}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
