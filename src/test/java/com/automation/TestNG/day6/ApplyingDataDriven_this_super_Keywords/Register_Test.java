package com.automation.TestNG.day6.ApplyingDataDriven_this_super_Keywords;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Register_Test extends TestBase{
	
	public WebDriver driver;
	
	public Register_Test() throws Exception {
		super();
	}
	@BeforeMethod
	public void setup() {
		driver = initializeBrowserAndOpenApplication("chrome");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}
	
	@Test(priority=1, invocationCount=5)
	public void registerAccountWithAllDetails() {
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys(Utilities.generateEmailWithTimeStamp());
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("987654321");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
	}
	
	@Test(priority=2)
	public void registerAccountWithMandatoryDetails() {
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda454542@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("987654321");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
	}
	
	@Test(priority=3)
	public void registerAccountWithNoDetails() {
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
	}
	
	@Test(priority=4)
	public void registerAccountWithExistingEmailID() {
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: E-Mail Address is already registered!";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
