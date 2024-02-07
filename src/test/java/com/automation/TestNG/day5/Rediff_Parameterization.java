package com.automation.TestNG.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Rediff_Parameterization {
	
	//What are the things we can parameterize?
	
	//browser
	//url
	//username
	//password
	
	public WebDriver driver;
	
	@Test
	@Parameters({"browser","url","username","password"})
	public void rediffTest(String browserName, String urlName, String usernameName, String passwordName) {
		
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.get(urlName);
		driver.findElement(By.id("login1")).sendKeys(usernameName);
		driver.findElement(By.id("password")).sendKeys(passwordName);
		driver.findElement(By.className("signinbtn")).click();
		driver.quit();
		
	}

}
