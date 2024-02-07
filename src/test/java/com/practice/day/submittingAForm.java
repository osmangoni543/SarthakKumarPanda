package com.practice.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class submittingAForm {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");
			driver.findElement(By.xpath("//a[text()='My Account']")).click();
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Selenium");
			driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Panda");
			driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("seleniumpanda@rediffmail.com");
			driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("5552225555");
			driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
			driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Selenium@123");
			driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@name='agree']")).click();
			driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).submit();
		
	}

}
