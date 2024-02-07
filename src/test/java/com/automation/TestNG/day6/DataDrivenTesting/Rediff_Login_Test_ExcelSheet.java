package com.automation.TestNG.day6.DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rediff_Login_Test_ExcelSheet {
	
	public WebDriver driver;
	
	@Test (priority=1, dataProvider="RediffData", dataProviderClass= Rediff_Login_Using_ExcelSheet.class)
	public void rediffLoginTest(String username, String password) {
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();
		driver.quit();
	}
	
}
