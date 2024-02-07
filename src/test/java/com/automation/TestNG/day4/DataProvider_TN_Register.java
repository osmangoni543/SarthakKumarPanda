package com.automation.TestNG.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_TN_Register {
	
	public WebDriver driver; 
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = {{"Selenium", "Panda", "seleniumpandey001@gmail.com","5555555555","Selenium@123"},
				           {"Selenium", "Panda", "seleniumpandey002@gmail.com","5555555555","Selenium@123"},
		                  };
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void registerTest(String firstName, String lastName, String email, String telephone, String password) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();;
		driver.findElement(By.linkText("Register")).click();;
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(firstName);
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(lastName);
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(telephone);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(password);
		driver.findElement(By.cssSelector("div#content form > fieldset:nth-child(3) > div >div > label >input[type='radio']")).click();
		driver.findElement(By.cssSelector("input[name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}

}
