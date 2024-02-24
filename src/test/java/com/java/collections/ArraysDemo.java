package com.java.collections;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int empId = 1122;
		empId =  3344;
		//System.out.println(empId);
		
		// we can not add new values into array - Arrays size is fixed
		// We can not store different type of data into current Array variable
		// Arrays store homogeneous data that means same type of data
		
		int[] empIds = {1122, 3344, 5544, 3311,1234};  //5
		String cities[] = {"London", "NewJersy", "NewYork"};
		boolean marStatus[] = {true, false};
		
		for(int i=0; i < empIds.length; i++) {
			System.out.println(empIds[i]);		
			}

		for(String bharath:cities);
		System.out.println(cities);
		
   // Capacity of the empIncentives array is 3. Means it stores only 3 values and not more than that
		
		int empIncentives[] = new int[9]; 
		
		for(int i=0; i < 8; i++) {
			empIncentives[i] = 100 + i; // 100 + 1 --> 101
			System.out.println( empIncentives[i]);
		}
		
		
	}

}
