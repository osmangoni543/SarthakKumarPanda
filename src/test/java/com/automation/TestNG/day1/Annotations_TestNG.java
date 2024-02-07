package com.automation.TestNG.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_TestNG {
	
	// annotations
	// For any annotation to work, you need to create the method below it.
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Executing first");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Executing second");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Executing third");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Executing fourth");
	}
	
	@Test // It is the execution engine. This is also Test Case.
	public void testcase1() {
		System.out.println("This is test case 1: "+ 1+2);
	}
	
	@Test // It is the execution engine. This is also Test Case.
	public void testcase2() {
		System.out.println("This is test case 2.");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("Executing fifth");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("Executing sixth");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("Executing seventh");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("Executing eigth");
	}

}
