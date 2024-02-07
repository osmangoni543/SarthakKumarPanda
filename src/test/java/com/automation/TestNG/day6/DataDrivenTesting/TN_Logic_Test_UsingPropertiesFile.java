package com.automation.TestNG.day6.DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TN_Logic_Test_UsingPropertiesFile {
	
	public WebDriver driver;
	
	@Test
	public void loginTest() throws Exception{
		
		//Step 1 = Create the object of Properties Class
		Properties prop = new Properties();
		
		//Step 2 = Create the object of FileInputStream Class and pass the path of the .properties file into this constructor
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\automation\\TestNG\\day6\\configTN.properties");
		
		//C:\\Users\\osman\\eclipse-workspace\\Maven_Project_1 == System.getProperty("user.dir")
		
		//Step 3 = Load the properties file
		prop.load(ip);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}

}
