package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basepageexcel2 {
	 public static WebDriver driver;
	 public static Properties prop;

	public Basepageexcel2()  {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/com.config2/configuration.properties");
			prop.load(ip);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}
	public static void initialization() {
		String browsername = prop.getProperty("browser");
		  if(browsername != null && browsername.trim().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		  }
			else if(browsername.equals("firefox")){
				  driver = new FirefoxDriver();
		}
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get(prop.getProperty("url"));
	}
	 public static void teardown() {
		 if(driver!= null) {
			 driver.close();
		 }
	 }

}
