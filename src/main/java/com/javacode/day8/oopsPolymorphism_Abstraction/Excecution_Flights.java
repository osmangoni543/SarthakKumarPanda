package com.javacode.day8.oopsPolymorphism_Abstraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excecution_Flights extends UnitedFlightBookingLogic implements DeccanAirways, SprintFlight {

	public static void main(String[] args) {
		
		DeccanAirways dc = new Excecution_Flights(); //this class is known as implementing class
		SprintFlight sf = new Excecution_Flights();
		
		//What abstract entity allows multiple inheritance?
		//Interface allows multiple inheritance
		//Abstract class do not allow multiple inheritance, you can only extend one abstract class
		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		WebDriver driver2 = new EdgeDriver();
		
		driver.get("https://rediff.com");

	}

	@Override
	public void flightDepurtureLogic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flightBookingLogic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deccanFlightLogic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deccanPaymentOption() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SprintFlightLogic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SprintFlightPayment() {
		// TODO Auto-generated method stub
		
	}

}
