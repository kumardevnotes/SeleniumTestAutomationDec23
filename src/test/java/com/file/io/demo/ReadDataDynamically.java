package com.file.io.demo;

import java.util.Scanner;

public class ReadDataDynamically {

	public static void main(String[] args) {
	
		Scanner scannerObj = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) { // 0, 1, 2, 3 and 4
			System.out.print("Enter the person age: ");
			int personAge = scannerObj.nextInt();
			System.out.println(personAge);
			if (personAge >= 18) {
				System.out.println("Person is a major");
			} else {
				System.out.println("Person is a minor");
			} 
		}
		
		System.out.println("Helllo!!");
		System.out.println("Hi!!!!!!!");
		
		System.out.println("Helllo!!");
		System.out.print("Hi!!!!!!!");
		System.out.print("Helllo!!");
	}

}
