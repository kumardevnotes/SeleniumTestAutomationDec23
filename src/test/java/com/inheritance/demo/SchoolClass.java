package com.inheritance.demo;

public class SchoolClass {
	
	public static void main(String[] args) {
		SchoolClass objct22 = new SchoolClass();
		objct22.displaySchoolAddress();
		objct22.displaySchoolName();
		System.out.println(objct22.getAnnualIncomeOfSchool());
	}

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
	
	//keyword public or private are called access specifiers
	//a method with private access specifier is not accessible outside the class. we can access it within the class only
	private  int getAnnualIncomeOfSchool() {
		return 1000000; // 1M$
	}
	
	
	/*
	 * protected access specifier is used when
	 *  - You have to access the method from inherited class object 
	 *     where those classes are from same or different packages
	 * */
	protected String getSchoolLocation() {
		return "NewJersy" ;
	}
	
}
