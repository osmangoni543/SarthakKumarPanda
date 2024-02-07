package com.practice.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xpath_Demo {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//span[@class = 'hidden-xs hidden-sm hidden-md' and contains(text(), 'My Account')]")).click();
		
	}	
	
	@Test(priority=1)
	public void loginTestXpath() {
		driver.findElement(By.xpath("//ul[@class = 'dropdown-menu dropdown-menu-right']/descendant::a[2]")).click();
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
	}
	
	@Test(priority=2)
	public void registerTestXpath() {
		driver .findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/descendant::a[1]")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("hawkat");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Ali");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("aa@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("14706585581");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("password123");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("password123");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}
	
	@Test(priority=3)
	public void loginTestCSS() {
		driver.findElement(By.xpath("ul.dropdown-menu.dropdown-menu-right>li:nth-child(2) > a")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	
	@Test(priority=4)
	public void registerTestCSS()
	{	
		driver .findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li:nth-child(1) > a")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("hayat");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("ali");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("hayat@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("1-472548445");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("hayat123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("hayat123");
		driver.findElement(By.cssSelector("input[name=agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	
	@AfterMethod
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	

}
