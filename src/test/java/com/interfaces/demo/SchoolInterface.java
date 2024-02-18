package com.interfaces.demo;

//Abstract class in java will have both abstract methods and non-abstract methods
//Abstract class starts with abstract keyword
public abstract class SchoolInterface {

	// Below 3 are abstract methods
	public abstract void printSchoolName(String schoolname);

	public abstract void printSchoolStrentgh(int headCount);

	public abstract void printSchoolID(int ID);
	
	//below is a non-abstract method or concrete method
	public void printSchoolName() {
		System.out.println("The King's Public School");
	}
}
