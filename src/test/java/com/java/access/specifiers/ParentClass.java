package com.java.access.specifiers;


//use final keyword before class name, so that none can extend or inherit this parent class
public class ParentClass {

	/*If you provide a final keyword before the parent class method,
	 * It will not be over-riden in child class
	 * 
	 * public final void displayEmpName()*/
	public void displayEmpName() {
		System.out.println("John Miller");
	}
	
	public int getEmpSal() {
		return 2000;
	}
	
	private void printSchoolAnnualIncome() {
		System.out.println("10000$");
	}
	
	protected void displaySchoolStaffCount() {
		System.out.println("100 members as Staff");
	}
	
}
