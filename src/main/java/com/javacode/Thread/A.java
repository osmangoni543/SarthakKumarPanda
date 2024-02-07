package com.javacode.Thread;

public class A extends Thread {
	
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
