package com.testng.demo;

import org.testng.annotations.Test;

public class FacebookTest {
 
  @Test (priority=2)
  public void facebookValidLoginCheck() {
	  System.out.println("Facebook login is verified with valid logins");
  }
  
  @Test (enabled=false)
  public void facebookInValidLoginCheck() {
	  System.out.println("Facebook login is verified with Invalid logins");
  }
}
