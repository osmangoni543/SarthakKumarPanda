package com.automation.TakeScreenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Demo {
		
		public WebDriver driver;
		
		@Test()
		public void checkScreenShot() throws IOException {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://openweathermap.org/");
			WebElement logo = driver.findElement(By.cssSelector("div.section.where-to"));
			File source = logo.getScreenshotAs(OutputType.FILE);
			File destination = new File(System.getProperty("user.dir")+"\\test-output\\ScreenShots\\logo1.png");
			FileHandler.copy(source, destination);
		}
		
		@Test
		public void jeevansathiScreenshot() throws IOException {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jeevansathi.com/");
			WebElement logo = driver.findElement(By.cssSelector("div.disp-flex.j_flex_end.f_direc_column.colrw.a_items_flex_endz"));
			File source = logo.getScreenshotAs(OutputType.FILE);
			File destination = new File(System.getProperty("user.dir")+"\\test-output\\ScreenShots\\logo2.png");
			FileHandler.copy(source, destination);
		}

	

}
