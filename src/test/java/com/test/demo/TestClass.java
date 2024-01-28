package com.test.demo;

import com.inheritance.demo.SchoolClass;

public class TestClass extends SchoolClass {

	public static void main(String[] args) {
		TestClass testClassObj = new TestClass();
		System.out.println(testClassObj.getSchoolLocation());
		
		SchoolClass schoolClassObj = new SchoolClass();
		//schoolClassObj.getSchoolLocation();
	}

}
