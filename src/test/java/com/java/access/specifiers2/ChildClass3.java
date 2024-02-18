package com.java.access.specifiers2;

import com.java.access.specifiers.ParentClass;

//protected method can be accessed by using the child class method even though non in same package
public class ChildClass3  extends ParentClass {
	public static void main(String args[]) {
		ChildClass3 obj3 = new  ChildClass3();
		//below is a private method and not visible to this class
		//obj3.printSchoolAnnualIncome();
		obj3.displayEmpName();
		//below  protected method  is allowed because childclass3 is inheriting parentclass
		obj3.displaySchoolStaffCount();
		
		
		//protected methods are not exposed out side of the package and by using ParentClass object
		ParentClass parentObj = new ParentClass();
		parentObj.displayEmpName();
		System.out.println(parentObj.getEmpSal());
		//below protected method is not allowed
		//obj3.displaySchoolStaffCount();
		

	}

}
