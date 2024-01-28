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
		
		object1.displayStdDetails("John");
		object1.displayStdDetails("Tom", 6);
		
		object1.getSchoolLocation();
		
		SchoolClass schoolObj = new SchoolClass();
		schoolObj.getSchoolLocation();
		
	}
	
	//non-static method
	public void displayStdName(String stdName) {
		System.out.println("StdName is: " + stdName);
	}
	
	//non-static
    public void displayStdID(int StdId) {
    	System.out.println("StdName is: " + StdId);
	}
    
    //Polymorphism - Method overloading. It happens in same class
    public void displayStdDetails(String stdName, int grade) {
    	System.out.println("Std Details: " + stdName + " from the grade " + grade);
    }
    
    public void displayStdDetails(String stdName) {
    	System.out.println("Std Name: " + stdName );
    }
    
    
    //Polymorphism - Method overriding. It happens between child and parent class only
    public void displaySchoolAddress() {
		System.out.println("789 King's Street, Easttown, USA 767679");
	}

}
