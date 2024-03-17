package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo12 {
	@Test
	public void secondTest() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
		Thread.sleep(4000);
		
		//Try to scroll up after scroll down
		JavascriptExecutor jsObj = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,400)", "");
		
		WebElement privacyPolicyElement  = driver.findElement(By.linkText("Privacy policy"));
		// Scrolling down the page till the element is found		
		jsObj.executeScript("arguments[0].scrollIntoView();", privacyPolicyElement); //privacyPolicyElement.scrollIntoView()
		Thread.sleep(2000);
		
		privacyPolicyElement.click();
		Thread.sleep(2000);

		driver.quit();
	}
}
