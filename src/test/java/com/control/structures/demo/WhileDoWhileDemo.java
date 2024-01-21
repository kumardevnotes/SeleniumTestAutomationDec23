package com.control.structures.demo;

public class WhileDoWhileDemo {

	public static void main(String[] args) {
		
		// while & do..while are similar to forloop. Based on some condition, if you want to repeat the same statement execution in your code
		
		int age =  20;
		//In while block, condition is checked first and if it is true, then the while block code is executed
		while (age > 18) { // 20 > 18
			System.out.println("The person is not a minor with age " + age);
			age--; // 18
		}
		
		int salary = 1002;
		//In do..while block, code is executed first and then condition is checked later
		do {
			System.out.println("person salary: "+ salary);
			salary--; // 1000
		} while (salary >= 1001); // 1000 >= 1001

	}

}
