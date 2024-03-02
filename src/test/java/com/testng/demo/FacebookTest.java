package com.testng.demo;

import org.testng.annotations.Test;

public class FacebookTest {
 
  @Test (groups = { "homepage"})
  public void facebookAppLogoCheck() throws Exception {
	  System.out.println("facebookAppLogoCheck is verified without issues");
	  Thread.sleep(1000);
  }
  
  @Test  (groups = { "login"})
  public void facebookInValidLoginCheck() throws Exception {
	  System.out.println("Facebook login is verified with Invalid logins");
	  Thread.sleep(1000);
  }
}
