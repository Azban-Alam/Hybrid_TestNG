package com.hybrid.testng.rough;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I Want To Open Browser");
		System.out.println("User Enter Valid UserName And Password");
		System.out.println("User Must Verify Home Page Is Displayed ");
	}

	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {

		System.out.println("Test-n Value Printed" +"---------" +n);
		System.out.println("Test-s Value Printed" +"---------" +s);

	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("User Should Click On Logout Button");
		System.out.println("User Should Close The Browser");

	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] { 1, "a" },
			new Object[] { 2, "b" }, 
			};
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("afterTest");

	}

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}

}
