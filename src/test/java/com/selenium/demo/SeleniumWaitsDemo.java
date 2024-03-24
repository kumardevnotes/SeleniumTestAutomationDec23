package com.selenium.demo;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitsDemo {
	
	/*What is a selenium wait  ?
	 * 2 types of waits in Selenium
	 * Implicit wait 
	 * Explicit wait
    */
	public static void main(String[] args) throws InterruptedException, Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//1. Implicit wait example below
		
		//pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		driver.get("https://www.speaklanguages.com");
		
		//Before throwing timeout exception, it will wait 60 seconds to locate the element on the page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		//driver.findElement(By.linkText("Log in")).click();
		
		
		
		//2. Explicit wait example below
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign up")));
		
		driver.findElement(By.linkText("Sign up")).click();
			
		
		Thread.sleep(2000);
		driver.quit();
	}

}
