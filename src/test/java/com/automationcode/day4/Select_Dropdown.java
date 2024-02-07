package com.automationcode.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown {
	
	public static Select select;

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Doe");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Johndoe876@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Johndoe876@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Selenium@123");
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("May");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("9");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}

}
