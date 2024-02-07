package com.automation.StaleElementReferenceException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Stale_Exception_Demo {
	
	public WebDriver driver;
	
	@Test
	
	public void checkForStaleException() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		List<WebElement> rediffFooterLinks = driver.findElements(By.xpath("//div[@class='footer alignC']/a"));
		System.out.println("Total Footer Links are :" + rediffFooterLinks.size());
		
		for(int i=0 ; i<rediffFooterLinks.size() ; i++) {
			rediffFooterLinks.get(i).click();
			
			System.out.println("The title of this page is: " + driver.getTitle());
			
			driver.navigate().back();
			
			rediffFooterLinks = driver.findElements(By.xpath("//div[@class = 'footer alignC']/a"));
	}

	}
	
	@Test
	public void checkForStaleElementBBC() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		Thread.sleep(2000);
		
		List<WebElement> bbcHeaderLinks = driver.findElements(By.xpath("//nav[@class= 'orbit-header-links international']/descendant::li"));
		
		for(int j=0; j<bbcHeaderLinks.size(); j++ ) {
			bbcHeaderLinks.get(j).click();
			Thread.sleep(2000);
			System.out.println("The Title of the page is :" + driver.getTitle());
			Thread.sleep(2000);
			driver.get("https://bbc.com");
			Thread.sleep(2000);
			bbcHeaderLinks = driver.findElements(By.xpath("//nav[@class= 'orbit-header-links international']/descendant::a"));
			Thread.sleep(2000);
		}
		
		}
	
}