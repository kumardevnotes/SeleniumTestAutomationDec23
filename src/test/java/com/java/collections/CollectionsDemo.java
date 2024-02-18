package com.java.collections;

import java.util.ArrayList; // ArrayList is a class in java.util package
import java.util.List; // List is an interface in java.util package

public class CollectionsDemo {

	public static void main(String[] args) {
		/*Write  a simple java program to store empDetails such as 
		 * empID, empName, empSal, empCity, empGender, empMarStatus
		 * */
		
		/*trying to assign List object with ArrayList Object as shown below
		 * Creating object of ArrayList with new ArrayList() and assigning this to list Object empDetails
		 * Then I can access methods of List and also ArrayList.. 10 + 10 --> 20
		 * */
		
		/* List is a collection and it is Dynamic in nature.
		 * Dynamic means, if you add/remove more values, its size/capacity is automatically adjusted
		 * No need to mention specific datatype, each data is stored as an Object
		 * 
		 * List collection follows index. List is index based
		 * List stores duplicate elements
		 * */
		
		List empDetails =  new ArrayList(); // ArrayList implements List
		empDetails.add(true); //index or postion 0
		empDetails.add(1122);
		empDetails.add("John Legend"); //3
		empDetails.add(2000); //4
		empDetails.add("Newyork");
		empDetails.add('M');
		empDetails.add("John Legend");
		empDetails.add(0, "100$"); // add() is overloaded in List collection
		
		System.out.println(empDetails);
		
		empDetails.remove(3);
		empDetails.remove("Newyork");
		
		System.out.println(empDetails.contains("Newjersy")); // false
		
		//empDetails.clear(); // clear will remove all the data in List collection
		
		
		System.out.println(empDetails);
		
		List empAdditionalDetails =  new ArrayList(); 
		empAdditionalDetails.add("2Kids");
		empAdditionalDetails.add("Insured");
		
		empDetails.addAll(empAdditionalDetails);
		System.out.println(empDetails);
		
//		for(Object object : empDetails) {
//			System.out.println(object);
//		}
		
	}

}
