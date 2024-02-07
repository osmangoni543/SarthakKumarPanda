package com.automation.TestNG.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_In_TentNg {

public WebDriver driver;
public SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void launchUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialsninja.com/demo");
	}
	
	@Test(priority = 1)
	public void loginLogic() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary"));
		WebElement editAccountInfoLink = driver.findElement(By.cssSelector("body>nav>div>div:nth-child(2)>ul.list-inline>li>a:nth-child(1)"));
		softassert.assertTrue(editAccountInfoLink.isDisplayed());
		System.out.println(1+2);
		softassert.assertAll();
	}
		
		@Test(priority = 2)
		public void negativeLogin() {
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Selenium@1234");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			
			String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert alert-danger alert-dismissible')]")).getText();
			String expectedWarningMessage= "Warning: No match for E-Mail Address and/or Password...";
			
			softassert.assertEquals(actualWarningMessage, expectedWarningMessage, "I am deliberately failing this.");
			System.out.println("My assertion for wrong login is Correct.");
			
		}
		
	
	
	@Test(priority = 2)
	public void logoutLogic() {
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary"));
		Assert.fail("Deliberately Failing");
		//WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		
		
		
		//softassert.assertTrue(logoutLink.isDisplayed());
		//logoutLink.click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
}
