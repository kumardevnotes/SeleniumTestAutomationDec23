package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo16 {
	@Test
	public void secondTest() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement LanguageDD  = driver.findElement(By.id("language_menu"));		
        js.executeScript("arguments[0].scrollIntoView();", LanguageDD); //privacyPolicyElement.scrollIntoView()
		Thread.sleep(2000);
		
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(LanguageDD).perform();
		Thread.sleep(4000);

		driver.quit();
	}
}
