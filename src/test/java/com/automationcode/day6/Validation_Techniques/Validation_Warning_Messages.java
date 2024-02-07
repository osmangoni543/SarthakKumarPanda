package com.automationcode.day6.Validation_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Warning_Messages {
	public static WebDriver driver;

	public static void main(String[] args) {
		

		//Validating warning message tutorialsninja login
		
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https:/tutorialsninja.com/demo");
//        driver.findElement(By.xpath("//span[@class = 'caret']")).click();
//        driver.findElement(By.xpath("//a[@href = 'https://tutorialsninja.com/demo/index.php?route=account/login']")).click();
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("seleniumpanda@gmail.com");
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Selenium");
//        driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
//	        
//        String actualWarningMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
//        String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
//        
//        if(actualWarningMessage.contains(expectedWarningMessage)) {
//        	System.out.println("The warning message is correct");
//        }
//        else {
//        	System.out.println("The warning message is incorrect");
//        }
        
        //Validating warning message tutorialsninja register
        
        
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
//		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Selenium");
//		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Panda");
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("seleniumpanda@rediffmail.com");
//		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("5552225555");
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
//		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Selenium@123");
//		driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();
//		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		
		String actualFirstNameMessage = driver.findElement(By.cssSelector("input#input-firstname+div")).getText();
		String actualLastNameMessage = driver.findElement(By.cssSelector("input#input-lastname+div")).getText();
		String actualEmailMessage = driver.findElement(By.cssSelector("input#input-email+div")).getText();
		String actualTelephoneMessage = driver.findElement(By.cssSelector("input#input-telephone+div")).getText();
		String actualPasswordMessage = driver.findElement(By.cssSelector("input#input-password+div")).getText();
		
		String expectedFirstNameMessage = "First Name must be between 1 and 32 characters!";
		String expectedLastNameMessage = "Last Name must be between 1 and 32 characters!";
		String expectedEmailMessage = "E-Mail Address does not appear to be valid!";
		String expectedTelephoneMessage = "Telephone must be between 3 and 32 characters!";
		String expectedPasswordMessage = "Password must be between 4 and 20 characters!";
		
		if(actualFirstNameMessage.contains(expectedFirstNameMessage)) {
			System.out.println("The First Name message is correct.");
		}
		else {
			System.out.println("The First Name message is incorrect.");
		}
		if(actualLastNameMessage.contains(expectedLastNameMessage)) {
			System.out.println("The Last Name message is correct.");
		}
		else {
			System.out.println("The Last Name message is incorrect.");
		}
		if(actualEmailMessage.contains(expectedEmailMessage)) {
			System.out.println("The E-mail message is correct.");
		}
		else {
			System.out.println("The E-mail message is incorrect.");
		}
		if(actualTelephoneMessage.contains(expectedTelephoneMessage)) {
			System.out.println("The Telephone message is correct.");
		}
		else {
			System.out.println("The Telephone message is incorrect.");
		}
		if(actualPasswordMessage.contains(expectedPasswordMessage)) {
			System.out.println("The Password message is correct.");
		}
		else {
			System.out.println("The Password message is incorrect.");
		}
        
	}

}
