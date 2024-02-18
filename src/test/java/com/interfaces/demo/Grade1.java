package com.interfaces.demo;

public class Grade1 implements ClassInterface {

	public static void main(String[] args) {
		Grade1 grade1Obj = new Grade1(); // Object creation of Grade1
		grade1Obj.printClassDetails("Garde1"); // Using the object, we are calling a non-static method printClassDetails()
		grade1Obj.printClassBlock("Block B");
		System.out.println("The student pass percentage is " +(grade1Obj.getClassPassPercentage(90)));
		
		grade1Obj.printClassTeacherName();
		
		//ClassInterface obj =  new ClassInterface(); 
		/* We should never create an object of an interface.
		 * Because interface has abstract methods only. That is methods without body
		  */
	}

	public void printClassTeacherName() {
	System.out.println("John Miller");
	}

	@Override
	public void printClassDetails(String className) {
		System.out.println(className);
	}

	@Override
	public void printClassBlock(String block) {
		System.out.println("The class is inside the " + block);
	}

	@Override
	public int getClassPassPercentage(int stClass) {
		return 0;
	}

}
