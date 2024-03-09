package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNGAnnotationsDemo1 {
	WebDriver driver = null;

	@Test
	public void launchLoginPage() {
		driver.findElement(By.linkText("Log in")).click();
	}

	@Test
	public void launchSignupPage() {
		driver.findElement(By.linkText("Sign up")).click();
	}

	@BeforeMethod
	public void beforeMethod() {
		// Launch Chrome browser
		driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// Launch speaklanguages application
		driver.get("https://speaklanguages.com");
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		// wait for 2 seconds
		Thread.sleep(2000);
		// Close the browser
		driver.quit();
	}

}
