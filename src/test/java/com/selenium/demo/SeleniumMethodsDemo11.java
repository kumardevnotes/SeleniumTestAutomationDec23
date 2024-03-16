package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo11 {
	@Test
	public void secondTest() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
	
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		
		boolean enabledOrNot  = driver.findElement(By.id("login_button")).isEnabled(); // buttons to check enabled or diabled
		boolean selectedOrNot  = driver.findElement(By.id("keep_logged_in_input")).isSelected(); // checkbox to check selected or not selected
		boolean displayedOrNot  = driver.findElement(By.xpath("//h1[.='Log in to Speak Languages']")).isDisplayed(); // to check visible on the screen or not
		
		System.out.println(enabledOrNot);
		System.out.println(selectedOrNot);
		System.out.println(displayedOrNot);
	
		Thread.sleep(2000);

		driver.quit();
	}
}
