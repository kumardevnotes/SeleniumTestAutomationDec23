package com.app.tests;

import org.testng.annotations.Test;

import com.app.pages.HomePage;
import com.app.pages.LoginPage;
import com.app.pages.SignUpPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ApplicationTests {
	
	WebDriver driver = null;
	HomePage homePage = null;
	SignUpPage singUpPage = null;
	LoginPage loginPage = null;
	

	@BeforeMethod
	public void beforeMethod() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://speaklanguages.com");
		Thread.sleep(2000);
		
		homePage =  new HomePage(driver);
		singUpPage =  new SignUpPage(driver);
		loginPage = new LoginPage(driver);
	}

	@Test
	public void verifyHomePage() {
		
	}

	@Test
	public void verifyAppLogin() {
	}

	@Test
	public void verifySignup() {
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
