package com.inheritance.demo;

public class SchoolClass {

	//Polymorphism in Oops OR Method overloading in Java - 
	// Creating methods with same name but with different parameters list
	
	public void displaySchoolName() {
		System.out.println("Talent High School");
	}
	
	public void displaySchoolName(String schoolName) {
		System.out.println(schoolName);
	}
	
	public void displaySchoolAddress() {
		System.out.println("123 Main Street, Midtown, USA 12345");
	}
	
}
