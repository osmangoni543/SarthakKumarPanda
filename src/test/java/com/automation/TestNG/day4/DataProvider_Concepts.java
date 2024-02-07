package com.automation.TestNG.day4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//There are 10 usernames/passwords combinations
//There is only one logic - login
//you have to determine which combinations are not working/working for the same logic
//Rules to us @DataProvider:
//1. @DataProvider returns a 2-Dimensional Object Array
//2. You have to pass no of rows and cols - you have to specify the data
//3. you have to use an annotation known as dataProvider inside the @Test case
//4. 1 dataProvider annotation is not @DataProvider
//5. You have to parameterize the Test Case


public class DataProvider_Concepts {
	
	@Test(dataProvider = "getData")
	public void loginTest(String username, String password, long mobilenumber, String browser) {
		
		System.out.println(username+" "+password+" "+mobilenumber+" "+browser);
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][4];
		
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = 929503460;
		data[0][3] = "Chrome";
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[1][2] = 929503461;
		data[1][3] = "Firefox";
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		data[2][2] = 929503462;
		data[2][3] = "Edge";
		
		return data;
	}

}
