package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDataProviderDemo {
	/*
	 * Launch chrome browser
	 * Maximize the browser
	 * Then launch https://speaklanguages.com application
	 * Click on "Log In" link
	 * Then enter email address and password and then click on "Log in' button
	 * The verify the login error, if any
	 * */
	@Test
	public void verifyAppLogin() throws Exception {
		
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// Launch speaklanguages application
		driver.get("https://speaklanguages.com");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("email_input")).sendKeys("johnnitesh2@gmail.com");
		driver.findElement(By.id("password_input")).sendKeys("Testing@123");
		Thread.sleep(1000);
		
		driver.findElement(By.id("login_button")).click();
		Thread.sleep(5000);

		// Close the browser
		driver.quit();
	}
}
