package com.selenium.demo;


import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo17 {
	@Test
	public void captureScreenshotDemo() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
		
		//get the project path in local
		String rootPath = System.getProperty("user.dir");
		
		//Capture the screenshot using selenium call
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//create a placeholder or dummy screenshot
		File dest = new File(rootPath + "//Screenshots/" + "screenshot1" + ".png");
		
		//now copy the screenshot from Line 24 to Line 27
		FileHandler.copy(src, dest);
		
		// close the browser
		driver.quit();
	}
}
