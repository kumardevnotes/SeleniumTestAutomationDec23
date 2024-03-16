package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo2 {
  @Test
  public void secondTest() throws Exception {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			
			
			//
			//
			//
			
			driver.quit();
  }
}
