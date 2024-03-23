package com.selenium.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo13 {
	@Test
	public void drodownSelectDemo() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
		
		driver.findElement(By.linkText("Sign up")).click();
		
		WebElement genderOrSex = driver.findElement(By.name("sex"));
		Select genderOrSexDropdown =  new Select(genderOrSex);

		
		genderOrSexDropdown.selectByIndex(0);
		genderOrSexDropdown.selectByIndex(1);
		genderOrSexDropdown.selectByIndex(2);
		
		
		genderOrSexDropdown.selectByValue("Male");
		genderOrSexDropdown.selectByValue("Female");
		
		genderOrSexDropdown.selectByVisibleText("Male");
		genderOrSexDropdown.selectByVisibleText("Female");


		driver.quit();
	}
}
