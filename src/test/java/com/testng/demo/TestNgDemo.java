package com.testng.demo;

import org.testng.annotations.Test;

public class TestNgDemo {
 
  @Test (priority=2)
  public void gmailValidLoginCheck() {
	  System.out.println("this is my first test in TestNG");
	  System.out.println("It is working as expected");
  }
  
  @Test (priority=1)
  public void gmailInValidLoginCheck() {
	  System.out.println("this is my second test in TestNG");
	  System.out.println("It is working as expected");
  }
}
