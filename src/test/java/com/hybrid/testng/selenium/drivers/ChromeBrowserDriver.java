package com.hybrid.testng.selenium.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserDriver implements Driver {
	
	WebDriver driver =null;
	

	public WebDriver getDriver() {
		if(driver != null) 
		return driver;
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Hybrid_TestNG\\src\\test\\resources\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

	public void tearDown() {
		if(driver != null) 
			driver.quit();
		
	}
	
	

}
