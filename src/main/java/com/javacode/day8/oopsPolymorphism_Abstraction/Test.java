package com.javacode.day8.oopsPolymorphism_Abstraction;

public class Test extends UnitedFlightBookingLogic{

	public static void main(String[] args) {
		
		//UnitedFlightBookingLogic ufb = new UnitedFlightBookingLogic(); You can't create an object of an abstract class.
		
		UnitedFlightBookingLogic ref = new Test();
		ref.flightArrivalLogic();
		ref.flightBookingLogic();
		ref.flightDepurtureLogic();
		
		
		Test test = new Test();

	}

	@Override
	public void flightDepurtureLogic() {
		
		System.out.println("Flight Depurture Logic");
		
	}

	@Override
	public void flightBookingLogic() {
		
		System.out.println("Flight Booking Logic");
		
	}

}
