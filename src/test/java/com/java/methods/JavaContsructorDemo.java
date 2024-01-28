package com.java.methods;

public class JavaContsructorDemo {
	
	/*Creating a java constructor below
	* a java method whose name is same as classname is called constructor
	*As soon as you create an object of your class, below constructor is called automatically, if it exists
	*Below is called default constructor or constructor with no params
	**/
	
	JavaContsructorDemo(){
		System.out.println("I am a constructor");
	}
	
	// parameterized constructor below
	JavaContsructorDemo(String message){
		System.out.println("I am parameterized constructor " + message);
	}

	public static void main(String[] args) {
		
		//creating a class object as shown below
		//below is a standard expression to create object of class
		JavaContsructorDemo object1 = new JavaContsructorDemo();
		
		object1.displayEmpFulName("Tom", "Cruise");
		object1.displayEmpId();
		
		JavaContsructorDemo object2 = new JavaContsructorDemo("Hello All!");
		object2.displayEmpFulName("John", "Legend");
		object2.displayEmpId();
		
	}

	//non-static method declaration in java
	public void displayEmpFulName(String firstName, String lastName) {
		System.out.println("emp fulName is: " + firstName + lastName );
	}

	// Declaring a non-static displayEmpId() without params or method declaration
	public  void displayEmpId() {
		int empId = 1122;
		System.out.println("empId is: " + empId); // ctrl + v
	}

}
