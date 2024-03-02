package com.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserWithParams {
	@Parameters({ "browser" })
	@Test
	public void launchApp(String browser) {
		WebDriver driver = null;

		switch (browser) {
		case "Chrome":
			// Launch Chrome browser
			driver = new ChromeDriver();
			break;
		case "Edge": 
			// Launch Edge browser
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please pass  a valid browser name");
		}

		// maximize browser
		driver.manage().window().maximize();

		// Launch Gmail app
		driver.get("https://speaklanguages.com");

		// Close the browser
		driver.quit();
	}
}
