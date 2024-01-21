package com.control.structures.demo;

public class ForloopDemoIII {

	public static void main(String[] args) {

		// how to format the code in eclipse editor ? ctrl + shift + f
		
		// how to use break statement to quit the forloop ?

		for (int i = 0; i < 10; i++) { // 2 ; 2 < 10
			if (i == 2) { // 2 == 2
				break;
			}
			System.out.println("Printing the iteration count: " + i);
		}

		System.out.println("I am from outside of forloop!");

		System.out.println("***************************");

		// how to use continue statement to skip a particular iteration in forloop?

		for (int i = 0; i < 10; i++) { // 2 ; 2 < 10
			if (i == 3) { // 3 == 3
				continue;
			}
			System.out.println("Printing the iteration count: " + i);
		}

		System.out.println("I am from outside of forloop!");

	}

}
