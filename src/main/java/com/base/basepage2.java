package com.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class basepage2 {
	public static WebDriver driver;
	public void initializtion() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}
	
	public void tearDown() {
		if (driver!=null)
		{
			driver.quit();
		}
	}
	

}
