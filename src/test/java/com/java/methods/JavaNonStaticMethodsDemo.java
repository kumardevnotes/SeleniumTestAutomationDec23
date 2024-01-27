package com.java.methods;

public class JavaNonStaticMethodsDemo {
	
	/* Java Methods
	 * 
	 * We use user defined methods in java to build our own logic and we have to call them i main() only
	 * 
	 * a method displayEmpId() is declared without params and returns void
	 * a method displayEmpMarStatus(true) is declared with one param which is boolean and returns void
	 * a method getEmpSalary(300) is declared with one param which is int and returns int
	 * a method displayEmpFulName("John" ,"Legend" ) is declared with 2 params and returns void
	 * */

	// main() is inbuilt java method
	public static void main(String[] args) {
		System.out.println("I am from main()"); // ctrl + c
		
		//Creating object of the class as shown below
		//Below is a standard expression in java to create an object of class
		JavaNonStaticMethodsDemo object1 = new JavaNonStaticMethodsDemo();
		
		//Calling all the 4 non-static methods using the class object - "object1"
		
		object1.displayEmpFulName("Tom", "Cruise");
		
		object1.displayEmpId();
		object1.displayEmpId();
		object1.displayEmpId();
		
		object1.displayEmpMarStatus(false);
		int finalSalary = object1.getEmpSalary(1500);
		System.out.println("Emp final salary: " + finalSalary);
		
		finalSalary = object1.getEmpSalary(2500);
		System.out.println("Emp final salary: " + finalSalary);
		
		finalSalary = object1.getEmpSalary(500);
		System.out.println("Emp final salary: " + finalSalary);
		
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

	// Declaring a non-static method with boolean parameter
	public void displayEmpMarStatus(boolean maritalStatus) { // true or false
		if (maritalStatus) {
			System.out.println("Emp is married");
		}

		else {
			System.out.println("Emp is not married");
		}
	}

	//non-static method with int return type and int param
	public int getEmpSalary(int incentive) {
		int fixedSalary  = 4200;
		return fixedSalary + incentive ;
	}
	
	
	
//	public static String abc() {
//		return "John";
//	}
//	
//
//	public static boolean xyz() {
//		return true;
//	}

}
