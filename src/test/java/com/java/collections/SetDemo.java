package com.java.collections;
import java.util.ArrayList; // ArrayList is a class in java.util package
import java.util.HashSet;
import java.util.List; // List is an interface in java.util package
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		/*Write  a simple java program to store empDetails such as 
		 * empID, empName, empSal, empCity, empGender, empMarStatus
		 * */
		
		/*trying to assign List object with HashSet Object as shown below
		 * Creating object of HashSet with new HashSet() and assigning this to list Object empDetails
		 * Then I can access methods of List and also HashSet.. 10 + 10 --> 20
		 * */
		
		/* List is a collection and it is Dynamic in nature.
		 * Dynamic means, if you add/remove more values, its size/capacity is automatically adjusted
		 * No need to mention specific datatype, each data is stored as an Object
		 * 
		 * Set collection doesn't follow index. Set is not index based
		 * Set doesn't store duplicate elements. Ex: In a class every student will have unique rollNumber
		 * */
		
		Set empDetails =  new HashSet(); // HashSet implements Set
		empDetails.add(true); 
		empDetails.add(1122);
		empDetails.add("John Legend");
		empDetails.add(2000); //4
		empDetails.add("Newyork");
		empDetails.add('M');
		empDetails.add("John Legend");
		
		//Below method will give an error because Set will not follow any index. So you can't store element at a particular index
		//empDetails.add(2, "100$"); // add() is overloaded in List collection
		
		//Below method will give an error due to index un-certainity
		//System.out.println(empDetails.get(2));
		
		
//		
//		System.out.println(empDetails.remove(3)); //Object 3 is not there. So it is a false
//		System.out.println(empDetails.remove("Newyork")); // true
//		
//		System.out.println(empDetails);
		
		//System.out.println(empDetails.contains("Newjersy")); // false
		
		System.out.println(empDetails.size()); // 7
		empDetails.clear(); // clear will remove all the data in List collection
		
		
		//System.out.println(empDetails);
		
//		Set empAdditionalDetails =  new HashSet(); 
//		empAdditionalDetails.add("2Kids");
//		empAdditionalDetails.add("Insured");
//		
//		empDetails.addAll(empAdditionalDetails);
//		System.out.println(empDetails);
//		
//		for(Object object : empDetails) {
//			System.out.println(object);
//		}
		
	}

}
