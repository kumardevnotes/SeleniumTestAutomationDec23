package com.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		/*
		 * empName --> JohnLegend
		 * empId --> 1122
		 * empGender --> 'M'
		 * */
		
		Map<String, String> empDetails = new HashMap<String, String>();
		
		// we use put() to store the data in the form of key & value pair in Map collection
		
		//Map doesn't follow any index or order while storing or printing values
		
		empDetails.put("empName", "JohnLegend");
		empDetails.put("empId", "1122");
		empDetails.put("empGender", "M");
		empDetails.put("empMarStatus", "Married");
		empDetails.put("empSal", "3500$");
		empDetails.put("empCity", "Newyork");
		empDetails.put("empHomeTown", "Newyork");
		
		//If you update existing key with a new value, then the old value is replaced with new value
		//Keys should always be unique but not the values
		empDetails.put("empMarStatus", "UnMarried");
		
		
       System.out.println(empDetails);
       
       Set<String> keys = empDetails.keySet();
       //System.out.println(keys);
       
       Collection<String> values = empDetails.values();
      // System.out.println(values);
       
       //entrySet() will give all the keyVal pairs
       Set<Map.Entry<String, String>> allKeyValPairs = empDetails.entrySet();
       
       for(Map.Entry<String, String> entryset : allKeyValPairs) {
    	  System.out.println(entryset.getKey() + "-->" + entryset.getValue() ); 
       }
		
		
		
	}

}
