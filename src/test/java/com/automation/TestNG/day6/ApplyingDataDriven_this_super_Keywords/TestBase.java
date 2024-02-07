package com.automation.TestNG.day6.ApplyingDataDriven_this_super_Keywords;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public WebDriver driver;
	public Properties prop;
	public Properties dataProp;
	
	public TestBase() throws Exception {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\automation\\TestNG\\day6\\ApplyingDataDriven_this_super_Keywords\\config.properties");
		prop.load(ip);
		
		dataProp = new Properties();
		FileInputStream ip1 = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\automation\\TestNG\\day6\\ApplyingDataDriven_this_super_Keywords\\dataProp.properties");
		dataProp.load(ip1);
	}
	
	
	public WebDriver initializeBrowserAndOpenApplication(String browserName) {
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
    	driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.get(prop.getProperty("url"));
		return driver;
	}

}
