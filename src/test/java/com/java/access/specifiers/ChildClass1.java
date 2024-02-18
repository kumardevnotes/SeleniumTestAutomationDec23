package com.java.access.specifiers;

public class ChildClass1 extends ParentClass {
	
	//If you declare any variable with final keyword in java, then its value can not be changed
	//if you try to change, it will give you syntax error
	 final int classID = 112233;

	public static void main(String[] args) {
		ChildClass1 obj1 = new ChildClass1();
		obj1.displayEmpName();
		System.out.println(obj1.getEmpSal());
		obj1.displayEmpGender();
		//obj1.classID =  445566;
		System.out.println(obj1.classID);
		
		ParentClass parentObj = new ParentClass();
		//Below protected method is allowed because both child and parent in same package
		parentObj.displaySchoolStaffCount();
	}
	
	public void displayEmpGender() {
		System.out.println('M');
	}
	/*
	 * Over-riding the parent class method 
	 * So that Child-class can write its own login in this over-riden method
	 * Dynamic Poly-morphism in java
	 * */
	public void displayEmpName() {
		System.out.println("The empName is:");
		System.out.println("Mike Tyson");
	}

}
