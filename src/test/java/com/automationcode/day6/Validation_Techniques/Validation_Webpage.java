package com.automationcode.day6.Validation_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Webpage {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		String actualTitle = driver.getTitle();
		String actualCurrentUrl = driver.getCurrentUrl();
		
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String expectedCurrentUrl = "https://www.rediff.com/";
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			driver.findElement(By.className("signin")).click();
		}
		else {
			System.out.println("Either my Title or Current URL is incorrect");
		}
		
		String actualLoginPageTitle = driver.getTitle();
		String actualLoginPageUrl = driver.getCurrentUrl();
		
		String expectedLoginPageTitle = "Rediffmail";
		String expectedLoginPageUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
		
		if(actualLoginPageTitle.equals(expectedLoginPageTitle) && actualLoginPageUrl.equals(expectedLoginPageUrl)) {
			driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
			driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
			driver.findElement(By.cssSelector("input.signinbtn")).click();
		}
		else {
			System.out.println("Either my Title or Current URL is incorrect");
		}
		
		
	}

}
