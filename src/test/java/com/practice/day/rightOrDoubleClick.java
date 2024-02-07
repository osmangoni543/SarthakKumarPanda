package com.practice.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightOrDoubleClick {
    public static void main(String[] args) {

//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://tutorialsninja.com/demo");
//        Actions actions = new Actions(driver); 
//        actions.contextClick(driver.findElement(By.xpath("//div[@id='search']/span/button"))).perform();
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Actions actions = new Actions(driver); 
        actions.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
}
}
