package com.automation.TestNG.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_TN_Register {
	
	public WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	
	@Test
	public void register_warning_messages() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualPrivacyMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		String expectedPrivacyMessage= "Warning: You must agree to the Privacy Policy!";
		
		softassert.assertEquals(actualPrivacyMessage , expectedPrivacyMessage);
		System.out.println("Privacy Warning message is Correct");
		
		String actualFirstnameMessage = driver.findElement(By.cssSelector("input#input-firstname+div")).getText();
		String expectedFirstnameMessage= "First Name must be between 1 and 32 characters!";
		
		softassert.assertEquals(actualFirstnameMessage,expectedFirstnameMessage);
		System.out.println("First Name Warning message is Correct");
		
		String actualLastnameMessage = driver.findElement(By.cssSelector("input#input-lastname+div")).getText();
		String expectedLastnameMessage= "Last Name must be between 1 and 32 characters!";
		
		softassert.assertEquals(actualLastnameMessage,expectedLastnameMessage);
		System.out.println("Last Name Warning message is Correct");
		
		String actualEmailMessage = driver.findElement(By.cssSelector("input#input-email+div")).getText();
		String expectedEmailMessage= "E-Mail Address does not appear to be valid!";
		
		softassert.assertEquals(actualEmailMessage,expectedEmailMessage);
		System.out.println("Email Warning message is Correct");
		
		String actualTelephoneMessage = driver.findElement(By.cssSelector("input#input-telephone+div")).getText();
		String expectedTelephoneMessage= "Telephone must be between 3 and 32 characters!";
		
		softassert.assertEquals(actualTelephoneMessage,expectedTelephoneMessage);
		System.out.println("Telephone Warning message is Correct");
		
		String actualPasswordMessage = driver.findElement(By.cssSelector("input#input-password+div")).getText();
		String expectedPasswordMessage= "Password must be between 4 and 20 characters!";
		
		softassert.assertEquals(actualPasswordMessage,expectedPasswordMessage);
		System.out.println("Password Warning message is Correct");
		
		softassert.assertAll();
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
