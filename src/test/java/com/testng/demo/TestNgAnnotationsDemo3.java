package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgAnnotationsDemo3 {
	@Test
	public void tc1Demo3() {
		System.out.println("tc1Demo3 passed without issues in Demo3");
	}

	@Test
	public void tc2Demo3() {
		System.out.println("tc2Demo3 passed without issues in Demo3");
	}

	@BeforeClass
	public void beforeClass() {
		 System.out.println("beforeClass verfied without issues in Demo3");
	}

	@AfterClass
	public void afterClass() {
		 System.out.println("afterClass verfied without issues in Demo3");
	}

	@BeforeTest
	public void beforeTest() {
		 System.out.println("beforeTest verfied without issues in Demo3");
	}

	@AfterTest
	public void afterTest() {
		 System.out.println("afterTest verfied without issues in Demo3");
	}

}
