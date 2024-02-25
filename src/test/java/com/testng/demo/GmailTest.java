package com.testng.demo;

import org.testng.annotations.Test;

public class GmailTest {
 
  @Test (priority=2, enabled=false)
  public void gmailValidLoginCheck() {
	  System.out.println("Gmail login is verified with valid logins");
  }
  
  @Test (priority=1)
  public void gmailInValidLoginCheck() {
	  System.out.println("Gmail login is verified with Invalid logins");
  }
}
