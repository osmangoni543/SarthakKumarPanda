package com.automationcode.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_In_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// id
		// class
		// name
		// linkTest
		// partialLinkTest
		// xpath
		// cssSelector
		// tagName
		
	/*	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
        driver.findElement(By.className("signin")).click();
        driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
        driver.findElement(By.name("passwd")).sendKeys("Selenium@123");
        driver.findElement(By.name("proceed")).click();
        
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https:/tutorialsninja.com/demo");
        driver.findElement(By.xpath("//span[@class = 'caret']")).click();
        driver.findElement(By.xpath("//a[@href = 'https://tutorialsninja.com/demo/index.php?route=account/login']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("seleniumpanda@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Selenium@123");
        driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
        
        driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("//a[@href='https://mail.rediff.com/cgi-bin/login.cgi\']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'proceed']")).click();
		driver.findElement(By.xpath("//a[@onclick='javascript:void(0)']")).click();
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//span[@class = 'caret']")).click();
		driver.findElement(By.xpath("//a[@href='https://tutorialsninja.com/demo/index.php?route=account/register']")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("5552225555");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
	*/
		
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
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}

}
