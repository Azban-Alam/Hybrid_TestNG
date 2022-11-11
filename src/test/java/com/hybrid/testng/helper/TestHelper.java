package com.hybrid.testng.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.hybrid.testng.selenium.drivers.Driver;
import com.hybrid.testng.selenium.drivers.WebBrowserFactory;
import com.hybrid.testng.utils.ApplicationConstants;
import com.hybrid.testng.utils.TestUtils;

public class TestHelper {

	public static Driver driver;
	public static Properties OR = new Properties();
	public static Properties config = new Properties();

	@BeforeSuite(alwaysRun = true)
	public void SetUp() {

		if (driver == null) {

			driver = WebBrowserFactory.getDriver(ApplicationConstants.CHROME_BROWSER);
		}
		
		//Loading OR Files
		this.loadORFiles();
		
		//Loading Config
		TestUtils.loadConfig();
			
		// Opening Browser
		driver.getDriver().get(config.getProperty("testUrl"));
	}

	@BeforeTest
	public void Login() throws InterruptedException {

		System.out.println("Log in to Application");

	}

	@AfterTest
	public void LogOut() {

		driver.getDriver().close();
		System.out.println("Window Closed");
	}

	@AfterSuite(alwaysRun = true)
	public void teardown() {
		if (driver == null) {

			driver.tearDown();

		}

	}

	private void loadORFiles() {

		File propertyDir = new File(System.getProperty("user.dir") + File.separator + "properties");
		if (propertyDir.isDirectory()) {

			File[] files = propertyDir.listFiles();
			for (File file : files) {

				try (FileInputStream fis = new FileInputStream(file)) {

					Properties prop = new Properties();
					prop.load(fis);
					OR.putAll(prop);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

}
