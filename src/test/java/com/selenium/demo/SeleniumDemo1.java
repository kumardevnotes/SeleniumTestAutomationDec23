package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDemo1 {
  @Test
  public void launchLoginPage() throws InterruptedException {
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.manage().window().fullscreen();

		// Launch speaklanguages application
		driver.get("https://www.speaklanguages.com");
		Thread.sleep(1000);
		
		// to click on Log in link on the homepage
		//driver.findElement(By.linkText("Log in")).click();
		
		//if your link text is changing again and again, then use partialLinkText
		//driver.findElement(By.partialLinkText("Log in")).click();
		Thread.sleep(1000);
		
//		driver.findElement(By.linkText("Sign up")).click();
//		Thread.sleep(1000);
		
		//driver.findElement(By.name("email")).sendKeys("ktest@gmail.com");
		
		
		
		boolean phraseGuidesTextdisplayed  = driver.findElement(By.xpath("//h1[.='Phrase guides']")).isDisplayed();
		System.out.println(phraseGuidesTextdisplayed);
		
		
		//Absolute xpath
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/form/p[1]/input")).sendKeys("ktest@gmail.com");

		
		driver.findElement(By.name("password")).sendKeys("pwd#112244");
		
		driver.findElement(By.id("email_1")).click();
		Thread.sleep(3000);
		
		boolean displayedorNot  = driver.findElement(By.className("error_message")).isDisplayed();
		
		//using tagName locator
		//driver.findElement(By.tagName("li")).click();
		
		System.out.println(displayedorNot);
		
		driver.quit();
  }
}
