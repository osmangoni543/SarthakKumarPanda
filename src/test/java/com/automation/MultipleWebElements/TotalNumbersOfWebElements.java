package com.automation.MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TotalNumbersOfWebElements {
	
	public WebDriver driver;
	
	@Test
	public void bbcLinks() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		//What is the total number of links ??
		System.out.println("Total links at this time: " + links.size());
		
		//You want to click on the 100th link out of those 280 links.
		
		WebElement hundredthLink = links.get(99);
		if(hundredthLink.isDisplayed()) {
		   hundredthLink.click();
		} else {
			System.out.println("The hundredth link is disabled. ");
		}
		//Determine the context of the link
		System.out.println(hundredthLink.getAttribute("href"));
		
		//Determine the x and y coordinates of the link
		System.out.println(hundredthLink.getLocation().x + "---->" + hundredthLink.getLocation().y);
		
		//Print all the links
		
	for(int i=0; i<links.size(); i++) {
		WebElement totalLinks = links.get(i);
		System.out.println(totalLinks.getText()+ "---------------------------" + totalLinks.isDisplayed());
	}
		
	}

}
