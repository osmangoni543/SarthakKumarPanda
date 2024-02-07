package com.javacode.practice;

public class Garbage_Collection_Finalize {
	
	public void finalize() {
		System.out.println("Garbage Collection");
	}

	public static void main(String[] args) {
		Garbage_Collection_Finalize g1 = new Garbage_Collection_Finalize();
		Garbage_Collection_Finalize g2 = new Garbage_Collection_Finalize();
		g1=null;
		g2=null;
		System.gc();
	}

}
