package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo15 {
	@Test
	public void findElementsDemo() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
	
		List<WebElement> langLinks = driver.findElements(By.xpath("//p[@class='site_link']//a"));
		System.out.println(langLinks.size());
		
		boolean isRussianDisplayed = false;
		
		for(WebElement link : langLinks) {
			String text = link.getText();
			System.out.println(text);
			if(text.equals("polish")) {
				isRussianDisplayed = true;
			}
		}
		
		if(isRussianDisplayed) {
		System.out.println("polish is displayed");
		}
		else {
			System.out.println("polish is not displayed");
		}
		
		Thread.sleep(2000);

		driver.quit();
	}
}
