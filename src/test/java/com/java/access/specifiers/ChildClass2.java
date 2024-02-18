package com.java.access.specifiers;

public class ChildClass2  extends ParentClass  {

	public static void main(String[] args) {
		ChildClass2 obj2 = new ChildClass2();
		obj2.displayEmpName();
		System.out.println(obj2.getEmpSal());
		obj2.displayEmpGender();
	}
	
	public void displayEmpGender() {
		System.out.println('F');
	}

}
