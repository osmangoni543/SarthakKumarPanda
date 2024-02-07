package com.automation.MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Flipkart {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test
	public void flipkartLinks() {
		options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/mens-formal-shirts/pr?sid=clo,ash,axc,mmk,bk1&fm=neo%2Fmerchandising&iid=M_068ae261-dd15-4019-8ca0-e90102ab345e_1_372UD5BXDFYS_MC.V795R35ST9K6&otracker=hp_rich_navigation_4_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear~Men%2527s%2BFormal%2BShirts_V795R35ST9K6&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_4_L2_view-all&cid=V795R35ST9K6");
		
		List<WebElement> formalShirts = driver.findElements(By.cssSelector("div._2WkVRV"));
		System.out.println("The total number of formalShirts are: " + formalShirts.size());
		
		List<WebElement> prices = driver.findElements(By.cssSelector("div._30jeq3"));
		System.out.println("The total number of prices are: " + prices.size());
		
		List<WebElement> discountPercentage = driver.findElements(By.cssSelector("div._3Ay6Sb"));
		System.out.println("The total number of discounts are: " + discountPercentage.size());
		
		for(int i=0; i<formalShirts.size(); i++) {
			System.out.println(formalShirts.get(i).getText()+ "------>" + prices.get(i).getText() 
					+ "------>" + discountPercentage.get(i).getText());
		}
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
