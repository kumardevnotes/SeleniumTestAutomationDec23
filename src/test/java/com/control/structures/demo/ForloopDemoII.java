package com.control.structures.demo;

public class ForloopDemoII {

	public static void main(String[] args) {

		// Arrays

		// (declaration; condition; increment/decrement)
//		for (int i = 0; i < 5; i++) { // 5; 5<5; 5
//			System.out.println("Printing the iteration count: " + i);
//		}
		
		int empId  =  1122; // A var in java can store only one value at a time. If you assign var with new value, the old value is replaced with the new value
//		System.out.println(empId);
		
		 empId = 1123; //overriding the value of var empId. I have lost the value of first empId
//		System.out.println(empId);
	
//		System.out.println(empId);
		
		//Store 5 empIds into a single variable using arrays
		
		 //Declaring and assigning integer array with integer values
		int empIds[] = {1122, 1123, 1124, 1125, 1126, 1122, 1123, 1124, 1125, 1126, 1122, 1123, 1124, 1125, 1126, 1122, 1123, 1124, 1125, 1129};//Declaring and assigning int array with 5 empIds
		
		//System.out.println(empIds); // Address in hash table
		
//		System.out.println(empIds[0]); //index of the first value or element in the array
//		System.out.println(empIds[1]); 
//		System.out.println(empIds[2]); 
//		System.out.println(empIds[3]); 
//		System.out.println(empIds[4]); 
//		
//		System.out.println(empIds[empIds.length-1]); //index of the last value or element in the array
		
		//If you want to run the same statement repeatedly based on some condition, we use forloop
		for (int i = 0; i < empIds.length; i++) {  // 20; 
			System.out.println(empIds[i]); //empIds[4]
		}
		
		/*
		 * Arrays are used to store multiple values into single variable
		 * We can access array values using index where the index starts from '0' and ends at array.length-1
		 * We can store only homogeneous data or and type of data
		 * */
		
		 //Declaring and assigning String array with String values
		String cities[] = {"Newyork" , "Newjersy", "London"};
		for (int i = 0; i < cities.length; i++) {  // 20; 
			System.out.println(cities[i]); 
		}
		
	}

}
