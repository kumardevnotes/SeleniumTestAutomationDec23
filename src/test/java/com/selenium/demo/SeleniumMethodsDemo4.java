package com.selenium.demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo4 {
	@Test
	public void secondTest() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

		// How to resize the window with given width and height ?
		Dimension obj = new Dimension(800, 400);
		driver.manage().window().setSize(obj);

		Thread.sleep(2000);

		// To close all the opened browsers, use quit()
		driver.quit();
	}
}
