package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo3 {
	@Test
	public void secondTest() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		// Launch a new tab and switch to it
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.speaklanguages.com");

		Thread.sleep(2000);

		// To close all the opened browsers, use quit()
		driver.quit();
	}
}
