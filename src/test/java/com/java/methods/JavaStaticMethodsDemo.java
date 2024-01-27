package com.java.methods;

public class JavaStaticMethodsDemo {
	
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

		// Calling a static method inside main()
		displayEmpId();

		// Calling a parameterized method with boolean value true
		displayEmpMarStatus(true);
		
		int finalSalary  = getEmpSalary(0);
		System.out.println("Emp final salary: " + finalSalary);
		
		displayEmpFulName("John", "Legend");
		
	}

	public static void displayEmpFulName(String firstName, String lastName) {
		System.out.println("emp fulName is: " + firstName + lastName );
	}

	// Declaring a static displayEmpId() without params or method declaration
	public static void displayEmpId() {
		int empId = 1122;
		System.out.println("empId is: " + empId); // ctrl + v
	}

	// Declaring a static method with boolean parameter
	public static void displayEmpMarStatus(boolean maritalStatus) { // true or false
		if (maritalStatus) {
			System.out.println("Emp is married");
		}

		else {
			System.out.println("Emp is not married");
		}
	}

	public static int getEmpSalary(int incentive) {
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
