package com.automation.TestNG.day2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo {
	
	@BeforeMethod
	
	public void beforeMethod() {
		System.out.println("This is Before Method Annotation.");
	}
	
	@Test
	
	public void tc1() {
		System.out.println("Tc1");
	}
	@Test
	
	public void tc2() {
		System.out.println("Tc2");
	}
	@Test
	
	public void tc3() {
		System.out.println("Tc3");
	}
	@Test
	
	public void tc4() {
		System.out.println("Tc4");
	}
	@Test
	
	public void tc5() {
		System.out.println("Tc5");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method annotation.");
	}

}
