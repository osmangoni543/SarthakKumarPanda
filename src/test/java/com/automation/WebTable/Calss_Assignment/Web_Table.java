package com.automation.WebTable.Calss_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

	//table[@class = 'dataTable'] -> represents the whole table
	//table[@class = 'dataTable']/thead -> represents the header row
	//table[@class = 'dataTable']/thead/tr -> represents the header row but this one is more accurate
	//table[@class = 'dataTable']/thead/tr/th[1] -> first col of the header row
	//table[@class = 'dataTable']/thead/tr/th[2] - 2nd col of the header row
	
	//table[@class = 'dataTable']/tbody -> this represents the webtable without the header row
	//table[@class = 'dataTable']/tbody/tr -> this represents all rows of the webtable without the header row
	//table[@class = 'dataTable']/tbody/tr[1] -> this represents the first row of the webtable
	//table[@class = 'dataTable']/tbody/tr[1]/td[1] -this represents col1 of row1
	//table[@class = 'dataTable']/tbody/tr[1]/td[2] -> this represents col2 of row1
	
	//table[@class = 'dataTable']/tbody/tr/td[1] -> this represents all values in 1st column
	//table[@class = 'dataTable']/tbody/tr/td[2] -> this represents all values in 2nd column

public class Web_Table {
	
	public WebDriver driver;
	
	@Test
	public void specificCompanyAndPrice() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
	List<WebElement> companyName = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
	List<WebElement> prices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
	
	String searchWithName = "Tips Films";
	
	for(int i=0; i<companyName.size(); i++) {
		if(searchWithName.equals(companyName.get(i).getText())) {
			System.out.println(companyName.get(i).getText()+ "---->" + prices.get(i).getText());
			break;
		}
	}
	}
	
	@Test
	public void first5rows() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr[position() <= 5]"));
		
		for(int i=0; i<rows.size(); i++) {
			System.out.println(rows.get(i).getText());
		}
		
	}
	
	
	@Test
	public void MultipleNamesAndPrices() {
	
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://money.rediff.com/gainers");
		List<WebElement> companyName = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		List<WebElement> prices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
		
		String searchWithName1 = "KIOCL";
		String searchWithName2 = "Cosyn L";
		String searchWithName3 = "UCO Bank";
		String searchWithName4 = "Elixir Capital";
		String searchWithName5 = "Tips Films";
		
		for(int i=0; i<companyName.size(); i++) {
			if(searchWithName1.equals(companyName.get(i).getText())) {
				System.out.println(companyName.get(i).getText()+ "---->" + prices.get(i).getText());
				break;
			}}
	    for(int i=0; i<companyName.size(); i++) {
			if(searchWithName2.equals(companyName.get(i).getText())) {
						System.out.println(companyName.get(i).getText()+ "---->" + prices.get(i).getText());
						break;
					}}
    	for(int i=0; i<companyName.size(); i++) {
			if(searchWithName3.equals(companyName.get(i).getText())) {
						System.out.println(companyName.get(i).getText()+ "---->" + prices.get(i).getText());
						break;
					}}
		for(int i=0; i<companyName.size(); i++) {
			if(searchWithName4.equals(companyName.get(i).getText())) {
						System.out.println(companyName.get(i).getText()+ "---->" + prices.get(i).getText());
						break;
					}}
		for(int i=0; i<companyName.size(); i++) {
			if(searchWithName5.equals(companyName.get(i).getText())) {
						System.out.println(companyName.get(i).getText()+ "---->" + prices.get(i).getText());
						break;
					}
		}
	}

}
