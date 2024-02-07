package com.javacode.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_TutorialNinja {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialsninja.com/demo");
		//driver.findElement(By.linkText("My Account")).click();
		
		WebElement searchOption = driver.findElement(By.name("search"));
		System.out.println(searchOption.getTagName());
		
		List<WebElement> tags = driver.findElements(By.tagName("input"));
		System.out.println(tags.size());
		
		//loginTest();
		
		//driver.findElement(By.linkText("My Account")).click();
		
		//registerTest();

	}
	
	public static void loginTest() {
		
		driver.findElement(By.linkText("Login")).click();;
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("johndoe543@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.cssSelector("div.list-group>a:nth-of-type(13)")).click();
		driver.findElement(By.cssSelector("div#content > div.buttons > div > a")).click();
	}
	
	public static void registerTest() {
		
		driver.findElement(By.linkText("Register")).click();;
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("John");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Doe");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("johndoe543@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("div#content form > fieldset:nth-child(3) > div >div > label >input[type='radio']")).click();
		driver.findElement(By.cssSelector("input[name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

}
