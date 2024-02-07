package com.automationcode.day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_InputParameters {
	
	public WebDriver driver;
	String url;
	String BrowserName;

	public static void main(String[] args) {
		
		Using_InputParameters ui = new Using_InputParameters();
		ui.loginTest(ui.driver, "https://www.google.com", "Chrome");

	}
	
	public void loginTest(WebDriver driver, String url, String BrowserName) {
		this.driver = driver;
//		url = "https://www.google.com";
//		BrowserName = "Chrome";
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}

}
