package com.java.variables.demo;

import java.util.Scanner;

public class ReadDataFromKeyboard {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i < 5; i++) { 
			
			System.out.println("Please enter person age below");
			
			int personAge =  scanner.nextInt();
			
//			double someDoubleVal =  scanner.nextDouble();
//			float someFloatVal =  scanner.nextFloat();
//			boolean someBooleanValue =  scanner.nextBoolean();
			
			if(personAge > 18) { // 30 > 18 --> false
				System.out.println("Person is a major");
			}
			else {
				System.out.println("Person is not a major");
			}
		}
	}

}
