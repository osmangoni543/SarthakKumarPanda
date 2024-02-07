package com.practice.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Validation_WebElement {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		WebElement logo = driver.findElement(By.cssSelector("div#logo"));
		
		if(logo.isDisplayed()) {
		System.out.println("Logo is Displayed");
		driver.findElement(By.xpath("//span[@class = 'hidden-xs hidden-sm hidden-md' and contains(text(), 'My Account')]")).click();
		}
		
	}	
	
	@Test(priority=1)
	public void loginTestXpath() {
		driver.findElement(By.xpath("//ul[@class = 'dropdown-menu dropdown-menu-right']/descendant::a[2]")).click();
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@class = 'btn btn-primary']"));
		if(loginBtn.isDisplayed() && loginBtn.isEnabled()) {
		System.out.println("The Login Button is Displayed and Enabled");
		
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		loginBtn.click();
		}
		else {
			System.out.println("The Login Button is Not Displayed or not Enabled");
		}
	}
	
	
	@AfterMethod
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	


}
