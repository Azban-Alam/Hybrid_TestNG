package com.hybrid.testng.selenium.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.hybrid.testng.helper.TestHelper;

public class Browsers extends TestHelper {

	public void openChromeBrowser() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\Hybrid_TestNG\\src\\test\\resources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public void openIEBrowser() {

	}

	public void openEdgeBroswe() {

	}

}
