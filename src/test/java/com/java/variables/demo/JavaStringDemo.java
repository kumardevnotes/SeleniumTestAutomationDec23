package com.java.variables.demo;

public class JavaStringDemo {

	public static void main(String[] args) {
		
		String city = "Newyork";
		// N-0 e-1 w-2 y-3 o-4 r-5 k-6 (length()-1)
		// index of firct char in String is 0
		//index of last char in a String is length()-1
		System.out.println(city); // type sysout and then press ctrl + spacebar. then it gives System.out.println()
		
		// ctrl + / --> comment or uncomment
		// ctrl + s --> to save the current file
		
		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());
		System.out.println(city.charAt(6));
		System.out.println(city.charAt(city.length()-1));
		System.out.println(city.length()); //7
		System.out.println(city.replace('e', 'x'));
		
		System.out.println(city.equals("Newyork")); //true
		System.out.println(city.equals("newyork")); //false
		System.out.println(city.equalsIgnoreCase("newyork")); //true
		
		System.out.println(city.contains("New"));
		System.out.println(city.startsWith("york"));
		System.out.println(city.endsWith("york"));

	}

}
