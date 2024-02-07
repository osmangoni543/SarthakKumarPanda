package com.practice.day;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class typedText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Dimension dimension = new Dimension(800, 600);
	    driver.manage().window().setSize(dimension);
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.name("search")).sendKeys("HP");

        System.out.println(driver.findElement(By.name("search")).getAttribute("value"));
	}

}
