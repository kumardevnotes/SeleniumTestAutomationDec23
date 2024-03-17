package com.selenium.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//How to handle browser alerts using Selenium ?
public class AlertsDemo14 {
	@Test
	public void secondTest() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);

		driver.findElement(By.name("proceed")).click();
		
		//to switch to the alert that is opened
		Alert alert =  driver.switchTo().alert();
		Thread.sleep(2000);
		
		String alertsText = alert.getText();
		System.out.println("text on the alert: " + alertsText);
		
		//to accept the alert
		alert.accept(); // to click on OK button on the alert
		
		//alert.dismiss(); // to click on Cancel button on the alert
		
		Thread.sleep(2000);
	
		driver.quit();
	}
}
