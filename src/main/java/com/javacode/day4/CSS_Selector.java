package com.javacode.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) {
		// html[attribute = value] - cssSelector basic syntax
		//Whenever there is an id attridute
		
		/*
		 * html#idvalue
		 * input#login1
		 * login1
		 * 
		 * Whenever there is a class attribute
		 * html.classvalue1
		 * if it is a compound class
		 * html.val1.val2.val3.valn
		 * 
		 * <input class = ="btn btn-primary"
		 * input.btn.btn-primary
		 * 
		 * rootelement > html
		 * p#signin_info > a.signin
		 * 
		 * rediff signin
		 * 
		 * sipposedly you are travesing from ancestor 
		 * lets say you are traversing from your parent
		 * lets say that parent has 3 kids 
		 * 
		 * <p
		 *   <a
		 *   <br
		 *   <a 
		 *   
		 * rootelementofparent > nth-child(1) -> this is okay
		 * rootelementofparent > nth-child(2) -> this is not okay  
		 * 
		 * nth-child means child number what?
		 * 
		 * p#signin_info > a:nth-child(3)
		 * 
		 * p#signin_info > a:nth-of-type(2)
		 * 
		 * p#signin_info a:nth-child(1)
		 * p#signin_info br:nth-child(2)
		 * p#signin_info a:nth-child(3)
		 * p#signin_info a:nth-of-type(1)
		 * p#signin_info a:nth-of-type(2)
		 * p#signin_info a + br + a
		 * p#signin_info a.signin + br + a
		 * input#OAS_subsection + style + div + div.logobar > div.table > div:nth-child(3) > p#signin_info > a:nth-of-type(2)
		 * 
		 * parent to child
		 * sibling to sibling
		 * 
		 * between siblings use +
		 * parent to child > or a space
		 * 
		*/
		
		WebDriver driver = new ChromeDriver();
		    driver.get("https:/tutorialsninja.com/demo");
	        driver.findElement(By.linkText("My Account")).click();
	        driver.findElement(By.linkText("Login")).click();
	        driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
	        driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
	        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		
		
		
	}

}
