package com.javacode.day8.oopsPolymorphism_Abstraction;

public abstract class UnitedFlightBookingLogic {

	public abstract void flightDepurtureLogic();
	
	public abstract void flightBookingLogic();
	
	//private abstract void paymentLogic();
	
	//a method without a body or implementation logic - it is known as unimplemented method or abstract method.
	
	public void flightArrivalLogic() {
		System.out.println("This is a concrete method.");
	}

}
