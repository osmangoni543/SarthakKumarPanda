package com.automationcode.day7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority_Check {

	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	
	@Test(priority=1)
	public void rediffTest() {
		
		driver.get("https://www.rediff.com");
        driver.findElement(By.className("signin")).click();
        driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
        driver.findElement(By.name("passwd")).sendKeys("Selenium@123");
        driver.findElement(By.name("proceed")).click();
	}
	
	@Test(priority=2, invocationCount = 5)
	public void tnTest() {
		
        driver.get("https:/tutorialsninja.com/demo");
        driver.findElement(By.xpath("//span[@class = 'caret']")).click();
        driver.findElement(By.xpath("//a[@href = 'https://tutorialsninja.com/demo/index.php?route=account/login']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("seleniumpanda@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Selenium@123");
        driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
