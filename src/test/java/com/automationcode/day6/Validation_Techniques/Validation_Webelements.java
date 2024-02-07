 package com.automationcode.day6.Validation_Techniques;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Webelements {
	public static WebDriver driver;
	
	// isDisplayed
	// isEnabled
	// isSelected

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		WebElement rediffLogo = driver.findElement(By.cssSelector("span.hmsprite.logo"));
		
		if(rediffLogo.isDisplayed()) {
			System.out.println("My url is correct.");
		}
		else {
			System.out.println("My url is incorrect");
		}
		
		WebElement signinLink = driver.findElement(By.className("signin"));
		
		if(signinLink.isEnabled() && signinLink.isDisplayed()) {
			signinLink.click();
			}
		else {
			System.out.println("The link is not valid");
		}
		
		WebElement usernameTextBox = driver.findElement(By.cssSelector("input#login1"));
		WebElement passwordTextBox = driver.findElement(By.cssSelector("input#password"));
		WebElement loginLink = driver.findElement(By.cssSelector("input.signinbtn"));
		
		
		if(usernameTextBox.isEnabled() && usernameTextBox.isDisplayed() && passwordTextBox.isEnabled() && passwordTextBox.isDisplayed() && loginLink.isEnabled() && loginLink.isDisplayed()) {
			usernameTextBox.sendKeys("seleniumpanda@rediffmail.com");
			passwordTextBox.sendKeys("Selenium@123");
			loginLink.click();
			}
		else {
			System.out.println("The Web Elements are not visible or enabled");
		}
		

	}
}
