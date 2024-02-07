package com.automationcode.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts_Popups {
	
	public WebDriver driver;
	
	@Test
	public void rediffAlert() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		//It will disable the background page
		
		//So first we have to handle this alert or popup
		Alert alert = driver.switchTo().alert(); //Alert is an interface
		System.out.println(alert.getText());//This method will give you the text inside the Alert
		alert.accept();
		//alert.dismiss(); //In case there is a dismiss option	
		
		//What are three important methods of Alert popups?
		//1.getText()
		//2.accept()
		//3.dismiss()
		
		Thread.sleep(2000); 
		
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		
	}

}
