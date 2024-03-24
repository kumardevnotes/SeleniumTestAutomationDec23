package com.selenium.demo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo7A {
	@Test
	public void secondTest() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");		
		String firstTab = driver.getWindowHandle();
		Thread.sleep(2000);
		
		
		//Trying to launch new tab in existing browser and launch new app in it
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://speaklanguages.com");
		String secondTab  = driver.getWindowHandle();
		Thread.sleep(2000);
		
		Set<String> allWindows  = driver.getWindowHandles();
		
		for(String window : allWindows) {
			driver.switchTo().window(window);
			Thread.sleep(2000);
		}
		
		// To close all the opened browsers, use quit()
		driver.quit();
	}
}
