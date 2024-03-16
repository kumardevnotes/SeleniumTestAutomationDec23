package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo8 {
	@Test
	public void secondTest() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

		// Trying to launch new tab in existing browser and launch new app in it
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://speaklanguages.com");
		Thread.sleep(2000);

		// Trying to launch new tab in existing browser and launch new app in it
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.co.in");
		Thread.sleep(2000);
		
		//close() closes the current window
		driver.close();

		Thread.sleep(2000);
		
		// To close all the opened windows
		driver.quit();
	}
}
