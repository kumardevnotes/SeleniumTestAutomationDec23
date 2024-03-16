package com.selenium.demo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo6 {
	@Test
	public void secondTest() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String firstTab = driver.getWindowHandle();
		System.out.println("firstTab ID:" + firstTab);
		Thread.sleep(2000);

		// Trying to launch new tab in existing browser and launch new app in it
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://speaklanguages.com");
		String secondTab = driver.getWindowHandle();
		System.out.println("secondTab ID:" + secondTab);
		Thread.sleep(2000);

		// To switch to a particular window using its ID - firstTab
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);

		// To switch to a particular window using its ID - secondTab
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);

		// To close all the opened browsers, use quit()
		driver.quit();
	}
}
