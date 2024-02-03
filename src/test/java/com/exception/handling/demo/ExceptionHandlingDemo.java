package com.exception.handling.demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		// An exception is something when a program's regular flow or execution is
		// terminated
		// due to this exception, we can not run the program till the end
		/*
		 * in catch block, we can use Exception class to handle any type of
		 * errors/exceptions in java in the same catch block, you can use specific
		 * exception class (ArithmeticException) to handle specific errors
		 */

		try {
			int var1 = 100;
			int var2 = 0;
			System.out.println(var1 / var2);

			String empName = "John Legend"; // nothing
			System.out.println(empName.toUpperCase());
			//
			//
			// create 2 new files

		} catch (ArithmeticException e) { // Exception
			System.out.println("inside catch block for ArithmeticException");
			e.printStackTrace();
		} catch (NullPointerException e) { // Exception
			System.out.println("inside catch block for NullPointerException");
			e.printStackTrace();
		}
       // Below block is optional
		finally {
			//to delete the newly created files
			System.out.println("I will run whther you get exception or not..");
		}

		System.out.println("All operations complete");
//		
//		try {
//			String empName = null; //nothing
//			System.out.println(empName.toUpperCase());
//		} catch (NullPointerException e) { // NullPointerException extends Exception
//			e.printStackTrace();
//		}

	}

}
