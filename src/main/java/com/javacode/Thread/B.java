package com.javacode.Thread;

public class B extends Thread{
	
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
