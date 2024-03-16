package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo9 {
	@Test
	public void secondTest() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");

		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("email_input")).sendKeys("TestUser@gmsil.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email_input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email_input")).sendKeys("TestUser@gmsil.com");
		
		
		driver.findElement(By.id("password_input")).sendKeys("pwd#1122");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login_button")).click();
		Thread.sleep(5000);
		
		// To close all the opened windows
		driver.quit();
	}
}
