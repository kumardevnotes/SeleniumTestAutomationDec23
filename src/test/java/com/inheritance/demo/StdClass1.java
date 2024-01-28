package com.inheritance.demo;

//Inheritance in java. It is one of the standard principles in Java's object oriented programming  (oops)
//           Childclass      Parentclass
//           Subclass        Superclass
public class StdClass1 extends SchoolClass { // 2 + 2 --> 4 methods

	public static void main(String[] args) {

		StdClass1 object1 = new StdClass1();
		
		object1.displayStdName("Mirza");
		object1.displayStdID(5566);
		
		object1.displaySchoolName("Reynolds High School");
		object1.displaySchoolAddress();
		
	}
	
	//non-static method
	public void displayStdName(String stdName) {
		System.out.println("StdName is: " + stdName);
	}
	
	//non-static
    public void displayStdID(int StdId) {
    	System.out.println("StdName is: " + StdId);
	}

}
