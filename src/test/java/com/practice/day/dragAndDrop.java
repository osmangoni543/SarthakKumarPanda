package com.practice.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(driver.findElement(By.id("credit2")), driver.findElement(By.id("bank"))).build().perform();
		

	}

}
