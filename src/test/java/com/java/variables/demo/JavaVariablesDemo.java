package com.java.variables.demo;

public class JavaVariablesDemo {
	/*
	 * A java class contains methods and variables A java method contains logic to
	 * execute If you want to run your logic keep it inside a main() and then save
	 * all your changes and then RunAs --> Java Application
	 */

	static String empName = "John"; // variable assignment happens from RHS to LHS

	public static void main(String[] args) {
		int age = 65; // Assignment happens from RHS to LHS
		// Age is variable in java
		// = is called assignment operator in java
		if (age > 0) { // 65 > 0
			System.out.println("Age is valid");
		}

		System.out.println(empName);

		// Calling a static method in java inside a main()
		displayEmpSalary();
		
		//Calling a static method
		displayEmpID();
	}

	// Declaring a static method in java
	public static void displayEmpSalary() {
		System.out.println("4000$/month");
	}

	// Declaring a static method in java
	public static void displayEmpID() {
		System.out.println("112233");
	}

}
