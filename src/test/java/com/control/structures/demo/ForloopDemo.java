package com.control.structures.demo;

public class ForloopDemo {

	public static void main(String[] args) {
		
		  //(declaration; condition; increment/decrement)
		for (int i = 0; i < 5; i++) { // 5; 5<5; 5
			System.out.println("Printing the iteration count: " + i);
		}
		
		System.out.println("I am outside forloop");
		
		System.out.println("************");
		
		  //(declaration; condition; increment/decrement)
			for (int i = 5; i >= 1; i--) { // 0; 0 >= 1
				System.out.println("Printing the iteration count: " + i);
			}
			
			System.out.println("I am outside forloop");
	}

}
