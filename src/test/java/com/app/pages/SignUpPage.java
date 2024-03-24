package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.github.javafaker.Faker;


public class SignUpPage {

	WebDriver driver = null;
	
	public SignUpPage(WebDriver driver) {
		this.driver =  driver;
	}
	
	public void verifySignup() throws Exception {
		
		Faker faker = new Faker();
		String firstName  = faker.name().firstName();
		String lastName  = faker.name().lastName();
		String emailAddress  = faker.internet().emailAddress();
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(emailAddress);
		
		
		driver.findElement(By.id("first_name")).sendKeys(firstName);
		driver.findElement(By.name("last_name")).sendKeys(lastName);
		driver.findElement(By.name("email")).sendKeys(emailAddress);
		driver.findElement(By.name("password")).sendKeys("Returns001122");
		
		WebElement genderOrSex = driver.findElement(By.name("sex"));
		Select genderOrSexDropdown =  new Select(genderOrSex);
		genderOrSexDropdown.selectByIndex(1);
		
		WebElement day = driver.findElement(By.name("dob_day"));
		Select dayDropdodown =  new Select(day);
		dayDropdodown.selectByIndex(1);
		
		WebElement month = driver.findElement(By.name("dob_month"));
		Select monthDropdown =  new Select(month);
		monthDropdown.selectByIndex(1);
		
		WebElement year = driver.findElement(By.name("dob_year"));
		Select yearDropdown =  new Select(year);
		yearDropdown.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@value='Sign up']")).click();
		
		Thread.sleep(8000);
		
		boolean signupSuccessMessageDisplayed = driver.findElement(By.xpath("//h1[contains(text(),'Thank you')]")).isDisplayed();
		Assert.assertEquals(signupSuccessMessageDisplayed, true);
	}
	
}
