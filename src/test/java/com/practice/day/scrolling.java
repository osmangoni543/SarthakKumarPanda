package com.practice.day;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,'1000');");
        js.executeScript("window.scrollBy(0,-'500');");
        
    }
}
