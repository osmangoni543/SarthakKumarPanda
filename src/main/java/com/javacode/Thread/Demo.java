package com.javacode.Thread;

public class Demo {
	
	//The method names should be run and call start() to run those methods.
	//The reange of priority goes from 1 to 10.

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		
		//obj1.setPriority(Thread.MAX_PRIORITY);
		//obj2.setPriority(Thread.MIN_PRIORITY);
		
		//System.out.println(obj1.getPriority());
		//System.out.println(obj2.getPriority());
		
		
		obj1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj2.start();

	}

}
