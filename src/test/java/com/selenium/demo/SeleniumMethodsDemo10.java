package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo10 {
	@Test
	public void secondTest() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
		
		String textCaptured  = driver.findElement(By.xpath("//div[@id='community']/h1")).getText();
		System.out.println(textCaptured);
		System.out.println(textCaptured.toLowerCase());
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Log in")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String name = driver.findElement(By.id("email_input")).getAttribute("name");
		String type  = driver.findElement(By.id("email_input")).getAttribute("type");
		String maxLength = driver.findElement(By.id("email_input")).getAttribute("maxlength");
		
		System.out.println(name);
		System.out.println(type);
		System.out.println(maxLength);

		Thread.sleep(2000);

		driver.quit();
	}
}
