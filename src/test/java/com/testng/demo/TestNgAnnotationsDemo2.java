package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgAnnotationsDemo2 {
  @Test
  public void tc1Demo2() {
	  System.out.println("tc1Demo2 passed without issues in Demo2");
  }
  
  @Test
  public void tc2Demo2() {
	  System.out.println("tc2Demo2 passed without issues in Demo2");
  }
  
  @BeforeClass
  public void beforeClass() {
	  // data generation steps you can keep
	  System.out.println("beforeClass verfied without issues in Demo2");
  }

  @AfterClass
  public void afterClass() {
	  //data deletion steps
	  System.out.println("afterClass verfied without issues in Demo2");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest verfied without issues in Demo2");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest verfied without issues in Demo2");
  }

  @BeforeSuite
  public void beforeSuite() {
	  // cleanup steps to delete old reports
	  //
	  System.out.println("beforeSuite verfied without issues in Demo2");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite verfied without issues in Demo2");
  }

}
