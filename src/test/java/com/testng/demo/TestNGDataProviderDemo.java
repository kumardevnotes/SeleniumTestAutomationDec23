package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
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
	
	@DataProvider(name = "credentials")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "johnnitesh2@gmail.com", "Testing@123" },
	   { "tomcruise1122@gmail.com", "pwd#1122" },
	   { "nitin.tyson@gmail.com", "ytyty&&^%" },
	 };
	}
	
	@Test (dataProvider = "credentials")
	public void verifyAppLogin(String emailAddress, String pwd) throws Exception {
		
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// Launch speaklanguages application
		driver.get("https://speaklanguages.com");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("email_input")).sendKeys(emailAddress);
		driver.findElement(By.id("password_input")).sendKeys(pwd);
		Thread.sleep(1000);
		
		driver.findElement(By.id("login_button")).click();
		Thread.sleep(5000);
		
		//Assertion  - Will validate whether the TC is passed or failed. Its like a checkpoint
		
		try {
			boolean errorDisplayed = driver.findElement(By.xpath("//li[@class='error_message']")).isDisplayed();
			if(errorDisplayed) {
				// Close the browser
				driver.quit();
			  Assert.fail("Login failed with logins: " + emailAddress + ":"+ pwd);
			}
			else {
				// Close the browser
				driver.quit();
				System.out.println("Login is succesful with logins: " + emailAddress + ":" + pwd);
			}
		} catch (NoSuchElementException e) {
			// Close the browser
			driver.quit();
			System.out.println("Login is succesful with logins: " + emailAddress + ":" + pwd);
		}

	
	}
}
