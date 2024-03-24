package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver = null;
	
	public LoginPage(WebDriver driver) {
		this.driver =  driver;
	}
	
	
	public void verifyLogin() throws Exception {
		
		driver.findElement(By.id("email_input")).sendKeys("johnnitesh2@gmail.com");
		driver.findElement(By.id("password_input")).sendKeys("Testing@123");
		driver.findElement(By.id("login_button")).click();
		
		Thread.sleep(5000);
		
		String loggedInUserName = driver.findElement(By.xpath("//li[@id='nav_user']//a")).getText();
		Assert.assertEquals(loggedInUserName, "nitesh");
	}
	
}
