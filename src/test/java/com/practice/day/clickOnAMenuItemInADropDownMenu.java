package com.practice.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickOnAMenuItemInADropDownMenu {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);

	    Actions actions = new Actions(driver);
	    actions.moveToElement(driver.findElement(By.id("month"))).perform();
	    driver.findElement(By.xpath("//select[@id='month']/option[1]")).click();
	}}
