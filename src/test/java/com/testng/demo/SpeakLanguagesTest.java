package com.testng.demo;

import org.testng.annotations.Test;

public class SpeakLanguagesTest {
 
  @Test (groups = { "login", "homepage"})
  public void validLoginCheck() throws Exception {
	  System.out.println("SpeakLanguages login is verified with valid logins");
	  Thread.sleep(1000);
  }
  
  @Test (groups = { "login"})
  public void invalidLoginCheck() throws Exception {
	  System.out.println("SpeakLanguages login is verified with Invalid logins");
	  Thread.sleep(1000);
  }
  
  @Test (groups = { "signup"})
  public void signUpIntoApp() throws Exception {
	  System.out.println("SpeakLanguages signUp verified without issues");
	  Thread.sleep(1000);
  }
  
  @Test (groups = { "homepage"})
  public void verifyAppLogo() throws Exception{
	  System.out.println("SpeakLanguages verifyAppLogo verified without issues");
  }
  
  @Test (groups = { "homepage"})
  public void verifyAppTitle() throws Exception {
	  System.out.println("SpeakLanguages verifyAppTitle verified without issues");
	  Thread.sleep(1000);
  }
 
  @Test (groups = { "homepage"})
  public void verifyAppFooterSection() throws Exception{
	  System.out.println("SpeakLanguages signUp verified without issues");
	  Thread.sleep(1000);
  }
}
