package com.automation.TestNG.day6.DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rediff_Login_Test_UsingPropertiesFile {
	
	public WebDriver driver;
	
	@Test
	public void rediffLoginTest() throws Exception {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\automation\\TestNG\\day6\\configRediff.properties");
		prop.load(ip);
		
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("login1")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.className("signinbtn")).click();
		driver.quit();
	}

}
