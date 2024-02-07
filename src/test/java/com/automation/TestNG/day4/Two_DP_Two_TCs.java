package com.automation.TestNG.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Two_DP_Two_TCs {
	
	public WebDriver driver;
	
	@Test(priority=1, dataProvider = "getTNData")
	public void loginTestTN(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/tutorialsninja.com/demo");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).sendKeys(username);
        driver.findElement(By.id("input-password")).sendKeys(password);
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	@Test(priority=2, dataProvider = "getRData")
	public void loginTestRediff(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
        driver.findElement(By.className("signin")).click();
        driver.findElement(By.id("login1")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.name("proceed")).click();
	}
	
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
