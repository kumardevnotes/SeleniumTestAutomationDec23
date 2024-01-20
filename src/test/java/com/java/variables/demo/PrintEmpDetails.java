package com.java.variables.demo;

public class PrintEmpDetails {

	public static void main(String[] args) {
		//EmpDetails --> EmpName, EmpID, EmpSal, EmpIncentive, EmpGender, EMpCity, EmpMaritalStatus
		
		String empName  = "John Legend"; // "Trainer" "Newyork"
		int empId = 112233;
		
		double empSal = 4000.45;
		float empIncentives =  100.6565908080808f;
		
		char empGender  = 'M'; // 'F'
		String empCity = "Newyork";
		boolean empMarStatus  = false ; // true means married, false means unmarried
		
System.out.println(empName + "  " + empId  + " " + empSal + " " + empIncentives  + " " + empGender + " " + empCity + " " + empMarStatus); //ctrl +v
		
	}
}
