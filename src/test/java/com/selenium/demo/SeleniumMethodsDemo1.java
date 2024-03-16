package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo1 {
  @Test
  public void firstTest() throws Exception {
			WebDriver driver = new ChromeDriver();
			
			//To maximize the browser use below maximize()
			driver.manage().window().maximize();
			
			//To launch the application use below get(String url)
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			
			
			driver.get("https://www.speaklanguages.com");
			Thread.sleep(2000);
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			Thread.sleep(2000);
			
			// to navigate back to the previous page use back()
			driver.navigate().back();
			Thread.sleep(2000);
			
			// to navigate forward to the next page use forward()
			driver.navigate().forward();
			Thread.sleep(2000);
			
			//to refresh the current page use refresh()
			driver.navigate().refresh();
			Thread.sleep(2000);
			
			driver.quit();
  }
}
