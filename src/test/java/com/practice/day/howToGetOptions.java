package com.practice.day;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class howToGetOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		Select select = new Select(driver.findElement(By.id("month")));
		List<WebElement> options = select.getOptions();
		
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
	}

}
