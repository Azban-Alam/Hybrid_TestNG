package com.hy.tstng.selenium.drivers;

import org.openqa.selenium.WebDriver;

public interface Driver {
	
	WebDriver getDriver();
	
	void tearDown();

}
