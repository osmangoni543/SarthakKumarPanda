package com.automation.TestNG.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TN_Parameterization {
	
	public WebDriver driver;
	
	@Test
	@Parameters({"browser","url","username","password"})
	public void tnLogin(String browserName, String urlName, String usernameName, String passwordName ) {
		
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.get(urlName);
		driver.findElement(By.id("input-email")).sendKeys(usernameName);
		driver.findElement(By.id("input-password")).sendKeys(passwordName);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}

}
