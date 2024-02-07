package com.automationcode.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAutomationCode {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//(Ctrl+Shift+O to import needed libraries))
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://costco.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://walmart.com");
	}

}
