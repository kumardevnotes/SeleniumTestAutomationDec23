package com.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CrossBrowserWithoutParams {

	/*
	 * Selenium Script: 
	 * 1. Launch Chrome browser 
	 * 2. maximize it 
	 * 3. Launch Gmail app
	 * 4. wait for 2 seconds 
	 * 5. Close the browser
	 */
	@Test(groups = { "gmail" })
	public void launchAppInChrome() throws Exception {
			// Launch Chrome browser
			WebDriver driver = new ChromeDriver(); // ChromeDriver implements WebDriver
			launchApp(driver);
	}
	
	@Test(groups = { "gmail" })
	public void launchAppInEdge() throws Exception {
			// Launch Edge browser
			WebDriver driver = new EdgeDriver(); // ChromeDriver implements WebDriver
			launchApp(driver);
	}
	
	public void launchApp(WebDriver driver) {
		//maximize browser
		driver.manage().window().maximize();
		// Launch Gmail app
		driver.get("https://speaklanguages.com");
		// Close the browser
		driver.quit();
	}
}
