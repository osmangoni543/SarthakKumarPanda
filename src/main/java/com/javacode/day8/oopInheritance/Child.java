package com.javacode.day8.oopInheritance;

public class Child extends Parent{
	public String cName;
	public int cAge;
	

	public static void main(String[] args) {
		
		Child child = new Child();
		child.gpName = "Nawab Ali";
		child.gpAge = 90;
		child.gpAddress();
		child.gpPhonenumber();
		Grandparent.gpIDnumber();
		
		child.pName = "Hossain";
		child.pAge = 65;
		child.pAddress();
		child.pPhonenumber();
		Parent.pIDnumber();
		
		child.cName="Joy";
		child.cAge=28;
		child.cAddress();
		child.cPhonenumber();
		cIDnumber();
		
	}
	
	
	public void cAddress() {
		System.out.println("This is child address.");
	}
	public void cPhonenumber() {
		System.out.println("This is child Phone number");
	}
	public static void cIDnumber() {
		System.out.println("This is child ID number.");
	}


}
