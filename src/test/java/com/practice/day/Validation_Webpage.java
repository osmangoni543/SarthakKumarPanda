package com.practice.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Validation_Webpage {
	

	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//span[@class = 'hidden-xs hidden-sm hidden-md' and contains(text(), 'My Account')]")).click();
		
	}	
	
	@Test(priority=1)
	public void loginTestXpath() {
		driver.findElement(By.xpath("//ul[@class = 'dropdown-menu dropdown-menu-right']/descendant::a[2]")).click();
		
		String actualTitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();
		
		String expectedTitle = "Account Login";
		String expectedUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";
		
		if(actualTitle.equals(expectedTitle)&&actualUrl.equals(expectedUrl)) {
			System.out.println("Title and Url is correct.");
			driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda@gmail.com");
			driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
			driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		} else {
			System.out.println("Title or Url is not correct.");
		}
	}
	
	
	@AfterMethod
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	


}
