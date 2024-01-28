package com.inheritance.demo;

public class StdClass2 extends SchoolClass { // 2 + 2 --> 4 methods

	public static void main(String[] args) {
		
		StdClass2 object1 = new StdClass2();
		object1.displayStdResults(20);
		
		object1.displaySchoolName("Model Public High School");
		object1.displaySchoolAddress();
		
		System.out.println(object1.getSchoolLocation()); //NewJersy
		
//		int income  = object1.getAnnualIncomeOfSchool();
//		System.out.println(income);
	
	}
	
	//non-static method
	public void displayStdResults(int stdFinalMarks) { // out of 100
		if(stdFinalMarks > 35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}


}
