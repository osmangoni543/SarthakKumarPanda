package com.automation.TestNG.Suite3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class4 {
	
	@Test
	public void logic() {
		
		int i= 3;
		int j= 4;
		
		Assert.assertTrue(i == j); //False		
	}

}
