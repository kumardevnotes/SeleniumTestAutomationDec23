package com.interfaces.demo;

public class MySchoolClass extends SchoolInterface{

	public static void main(String[] args) {
		MySchoolClass obj = new MySchoolClass(); 
		// If you create object of a class, you can call methods of its own and also methods from abstract class
		obj.printSchoolName();
		obj.printSchoolID(112233);
		obj.printSchoolStrentgh(150);
		
		obj.printSchoolName("The Queen's High School");
		obj.printSchoolName("The Minister's High School");
		obj.printSchoolName("The Prince High School");
	}

	//String interpolation or string placeholder in Java
	@Override
	public void printSchoolName(String schoolname) {
		System.out.println(String.format("The school Name is %s and it is located in unites states", schoolname));
	}

	@Override
	public void printSchoolStrentgh(int headCount) {
		System.out.println("Count of students " + headCount); // Count of students 150
	}

	@Override
	public void printSchoolID(int ID) {
	System.out.println("RegId: " + ID);
	}
	/*
	 * what is Method over-riding in Java ?
	 * If you have same method name with same param list in Child and Parent classes,
	 *  then it is called method over-riding in Java
	 * If you create object of a child class and call this over-riden method,
	 *  then the child class method is called but not Parent class method
	 * 
	 * */
//	public void printSchoolName() {
//		System.out.println("The schoolname is Clevers High School");
//	}

}
