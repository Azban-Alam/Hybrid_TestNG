package com.hy.tstng.selenium.drivers;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserDriver implements Driver {
	
	WebDriver driver =null;
	

	public WebDriver getDriver() {
		if(driver != null) 
		return driver;
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Hybrid_TestNG\\Drivers\\chromedriver.exe");
		
		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

	public void tearDown() {
		if(driver != null) 
			driver.quit();
		
	}
	
	

}