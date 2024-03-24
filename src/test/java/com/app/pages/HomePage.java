package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver = null;
	
	public HomePage(WebDriver driver) {
		this.driver =  driver;
	}
	
	public void verifyTitle() {
		String homePagetitle  = driver.getTitle();
		Assert.assertEquals(homePagetitle, "Speak All Languages — Learn a new language online", "homepage title verification failed. Please check!");
		System.out.println("homepage title verified");
	}

	public void verifyApplogo() {
		boolean isLogoDisplayed = driver.findElement(By.id("logo")).isDisplayed();
		Assert.assertEquals(isLogoDisplayed, true, "homepage logo verification failed");
		System.out.println("homepage logo verified");
	}

	public void verifHomePageObjects() {
		boolean isSearcFieldDisplayed = driver.findElement(By.id("search_input")).isDisplayed();
		boolean isSearchButtonDisplayed = driver.findElement(By.id("search_submit")).isDisplayed();
		boolean isLoginLinkDisplayed = driver.findElement(By.linkText("Log in")).isDisplayed();
		boolean isSignupLinkDisplayed = driver.findElement(By.linkText("Sign up")).isDisplayed();
		boolean isHeader1Displayed = driver.findElement(By.xpath("//h1[.='Phrase guides']")).isDisplayed();
		boolean isHeader2Displayed = driver.findElement(By.xpath("//h1[.='About Speak Languages']")).isDisplayed();
		
		Assert.assertEquals(isSearcFieldDisplayed && isSearchButtonDisplayed
				&&isLoginLinkDisplayed && isSignupLinkDisplayed
				&&isHeader1Displayed &&isHeader2Displayed,
				true);
		System.out.println("homepage objects verified");
	}

	public void launchLoginPage() {
		driver.findElement(By.linkText("Log in")).click();
	}

	public void launchSignUpPage() {
		driver.findElement(By.linkText("Sign up")).click();
	}
}
