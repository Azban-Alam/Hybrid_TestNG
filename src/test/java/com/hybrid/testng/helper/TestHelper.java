package com.hybrid.testng.helper;

/*
 * Question: What is the use of helper class
 * 
 * Initialization Of Below Mentioned Items
 * a> WebDriver
 * b> Properties Files
 * c> Logs
 * d> Extent Reports
 * e> Excel
 * f> Mail
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.hybrid.testng.selenium.drivers.Driver;
import com.hybrid.testng.selenium.drivers.WebBrowserFactory;
import com.hybrid.testng.utils.ApplicationConstants;
import com.hybrid.testng.utils.TestUtils;

public class TestHelper {

	public static WebDriver driver;
	public static Properties OR = new Properties();
	public static Properties config = new Properties();

	@BeforeSuite(alwaysRun = true)
	public void SetUp() {

		// Loading OR Files
		TestUtils.loadORFiles();

		// Loading Config Files
		TestUtils.loadConfig();

	}

	@BeforeTest
	public void Login() throws InterruptedException {

	}

	@AfterTest
	public void LogOut() {

	}

	@AfterSuite(alwaysRun = true)
	public void teardown() {

	}

}
