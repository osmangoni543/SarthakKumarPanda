package com.automation.TestNG.day6.ApplyingDataDriven_this_super_Keywords;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Test extends TestBase{
	
	public Login_Test() throws Exception {
		super();
	}

	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = initializeBrowserAndOpenApplication("chrome");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	
	@Test(priority=1, dataProvider="TNData", dataProviderClass=Read_From_ExcelSheet.class)
	public void verifyLoginWithValidCredentials(String validemail, String validpassword) {
		driver.findElement(By.id("input-email")).sendKeys(validemail);
		driver.findElement(By.id("input-password")).sendKeys(validpassword);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	@Test(priority=2)
	public void verifyLoginWithValidEmailAndInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	@Test(priority=3)
	public void verifyLoginWithInvalidEmailAndValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpandaa@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	@Test(priority=4)
	public void verifyLoginWithInvalidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpandaa@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	@Test(priority=5)
	public void verifyLoginWithNoCredentials() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
